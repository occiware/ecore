NIGHTLY_PATTERN=CloudDesigner.$VERSION.N

# clear last nightly
for file in $(curl --list-only --silent -uwpiers:$KEY https://dl.bintray.com/wpiers/generic/ | grep 'href="#'$NIGHTLY_PATTERN | sed 's/.*href="#//' | sed 's/".*//');
do curl -uwpiers:$KEY -X DELETE https://api.bintray.com/content/wpiers/generic/$file
done

# copy new artifacts
cd clouddesigner/org.occiware.clouddesigner.product/target/products
curl -T org.occiware.clouddesigner.product-linux.gtk.x86_64.zip -uwpiers:$KEY https://api.bintray.com/content/wpiers/generic/CloudDesigner/$VERSION/CloudDesigner.$VERSION.N$TRAVIS_BUILD_NUMBER.linux.gtk.x86_64.zip
curl -T org.occiware.clouddesigner.product-macosx.cocoa.x86_64.zip -uwpiers:$KEY https://api.bintray.com/content/wpiers/generic/CloudDesigner/$VERSION/CloudDesigner.$VERSION.N$TRAVIS_BUILD_NUMBER.macosx.cocoa.x86_64.zip
curl -T org.occiware.clouddesigner.product-win32.win32.x86.zip -uwpiers:$KEY https://api.bintray.com/content/wpiers/generic/CloudDesigner/$VERSION/CloudDesigner.$VERSION.N$TRAVIS_BUILD_NUMBER.win32.x86.zip

# publish nightly
curl -XPOST -uwpiers:$KEY https://api.bintray.com/content/wpiers/generic/CloudDesigner/$VERSION/publish
