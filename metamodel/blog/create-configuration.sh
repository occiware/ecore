#!/bin/sh

SERVER=$1
COPTS="-s -v" # -i

curl $COPTS -X PUT $SERVER/blog/blog-1 -H 'Content-Type: text/occi' -H 'Category: blog; scheme="http://example.org/occi/test#"; class="kind";' -H 'X-OCCI-Attribute: example.blog.title="OCCIware Blog"'
curl $COPTS -X PUT $SERVER/entry/entry-1 -H 'Content-Type: text/occi' -H 'Category: entry; scheme="http://example.org/occi/test#"; class="kind";' -H 'X-OCCI-Attribute: blog.entry.title="Welcome"' -H 'X-OCCI-Attribute: blog.entry.date="2015/01/01"' -H 'X-OCCI-Attribute: blog.entry.content="Welcome"'
curl $COPTS -X PUT $SERVER/entry/entry-2 -H 'Content-Type: text/occi' -H 'Category: entry; scheme="http://example.org/occi/test#"; class="kind";' -H 'X-OCCI-Attribute: blog.entry.title="First audio"' -H 'X-OCCI-Attribute: blog.entry.date="2015/01/02"' -H 'X-OCCI-Attribute: blog.entry.content="First audio"'
curl $COPTS -X PUT $SERVER/entry/entry-3 -H 'Content-Type: text/occi' -H 'Category: entry; scheme="http://example.org/occi/test#"; class="kind";' -H 'X-OCCI-Attribute: blog.entry.title="First tips"' -H 'X-OCCI-Attribute: blog.entry.date="2015/01/03"' -H 'X-OCCI-Attribute: blog.entry.content="First tips"'
curl $COPTS -X PUT $SERVER/user/user-1 -H 'Content-Type: text/occi' -H 'Category: user; scheme="http://example.org/occi/test#"; class="kind";' -H 'X-OCCI-Attribute: blog.user.name="Marc Dutoo"' -H 'X-OCCI-Attribute: blog.user.email="Marc.Dutoo@openwide.fr"' -H 'X-OCCI-Attribute: blog.user.role="Project leader"'
curl $COPTS -X PUT $SERVER/user/user-2 -H 'Content-Type: text/occi' -H 'Category: user; scheme="http://example.org/occi/test#"; class="kind";' -H 'X-OCCI-Attribute: blog.user.name="Philippe Merle"' -H 'X-OCCI-Attribute: blog.user.email="Philippe.Merle@inria.fr"' -H 'X-OCCI-Attribute: blog.user.role="Scientific and technical responsible"'
curl $COPTS -X PUT $SERVER/user/user-3 -H 'Content-Type: text/occi' -H 'Category: user; scheme="http://example.org/occi/test#"; class="kind";' -H 'X-OCCI-Attribute: blog.user.name="Jean Parpaillon"' -H 'X-OCCI-Attribute: blog.user.email="Jean.Parpaillon@inria.fr"' -H 'X-OCCI-Attribute: blog.user.role="Research engineer"'

curl $COPTS -X PUT $SERVER/link/link-1 -H 'Content-Type: text/occi' -H 'Category: link; scheme="http://schemas.ogf.org/occi/core#"; class="kind";' -H 'X-OCCI-Attribute: occi.core.source="/blog/blog-1", occi.core.target="/entry/entry-1"'
curl $COPTS -X PUT $SERVER/link/link-2 -H 'Content-Type: text/occi' -H 'Category: link; scheme="http://schemas.ogf.org/occi/core#"; class="kind";' -H 'X-OCCI-Attribute: occi.core.source="/blog/blog-1", occi.core.target="/entry/entry-2"'
curl $COPTS -X PUT $SERVER/link/link-3 -H 'Content-Type: text/occi' -H 'Category: link; scheme="http://schemas.ogf.org/occi/core#"; class="kind";' -H 'X-OCCI-Attribute: occi.core.source="/blog/blog-1", occi.core.target="/entry/entry-3"'
curl $COPTS -X PUT $SERVER/author/author-1 -H 'Content-Type: text/occi' -H 'Category: author; scheme="http://example.org/occi/test#"; class="kind";' -H 'X-OCCI-Attribute: occi.core.source="/entry/entry-1", occi.core.target="/user/user-1"'
curl $COPTS -X PUT $SERVER/author/author-2 -H 'Content-Type: text/occi' -H 'Category: author; scheme="http://example.org/occi/test#"; class="kind";' -H 'X-OCCI-Attribute: occi.core.source="/entry/entry-2", occi.core.target="/user/user-2"'
curl $COPTS -X PUT $SERVER/author/author-3 -H 'Content-Type: text/occi' -H 'Category: author; scheme="http://example.org/occi/test#"; class="kind";' -H 'X-OCCI-Attribute: occi.core.source="/entry/entry-3", occi.core.target="/user/user-3"'

