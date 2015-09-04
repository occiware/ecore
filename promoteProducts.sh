PRODUCT=CloudDesigner
VERSION=0.1.0
BINTRAY_USER=wpiers
BINTRAY_R=https://dl.bintray.com/$BINTRAY_USER/generic
BINTRAY_W=https://api.bintray.com/content/$BINTRAY_USER/generic

# clear last nightly products 
NIGHTLY_PATTERN=$PRODUCT.$VERSION.N
for file in $(curl --list-only --silent -u$BINTRAY_USER:$KEY $BINTRAY_R/ | grep $NIGHTLY_PATTERN | sed 's/.*href=".//' | sed 's/".*//');
do curl -u$BINTRAY_USER:$KEY -X DELETE $BINTRAY_W/$file
done

# copy new products
VERSION_DIR=$BINTRAY_W/$PRODUCT/$VERSION
cd clouddesigner/org.occiware.clouddesigner.product/target/products
curl -T org.occiware.clouddesigner.product-linux.gtk.x86_64.zip -u$BINTRAY_USER:$KEY $VERSION_DIR/$PRODUCT.$VERSION.N$TRAVIS_BUILD_NUMBER.linux.gtk.x86_64.zip
curl -T org.occiware.clouddesigner.product-macosx.cocoa.x86_64.zip -u$BINTRAY_USER:$KEY $VERSION_DIR/$PRODUCT.$VERSION.N$TRAVIS_BUILD_NUMBER.macosx.cocoa.x86_64.zip
curl -T org.occiware.clouddesigner.product-win32.win32.x86.zip -u$BINTRAY_USER:$KEY $VERSION_DIR/$PRODUCT.$VERSION.N$TRAVIS_BUILD_NUMBER.win32.x86.zip

# publish nightly 
curl -XPOST -u$BINTRAY_USER:$KEY $VERSION_DIR/publish
