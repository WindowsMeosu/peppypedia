---
title: [page-template]
lastmod: [2022-11-17]
categories: [templates]
category: [templates]
menu:
  docs:
    parent: "templates"
aliases: [format-template]
stub: [true]
peppypedia-jekyll: [false]
peppypedia-current: [true]
---
# Page Template
* Page Templates for peppypedia.
# Markdown
* All pages should always start with this:
<pre>
---
title: [page-template]
lastmod: [2022-11-17]
categories: [templates]
menu:
  docs:
    parent: "templates"
aliases: [format-template]
stub: [false]
peppypedia-jekyll: [false]
peppypedia-current: [true]
 ---
</pre>
peppypedia-jekyll or peppypedia-old should usually be marked false, Template pages should be added to -old as well.
refer to it as peppypedia-old hence both ppypedia-current and ppypedia-old use jekyll. 
  
# Stubs
if 'stub:' is marked [true] then this following example should be used:
<pre>
&lt;table&gt;
&lt;tbody&gt;&lt;tr&gt;
&lt;th&gt;
This page does not list much information about this particular person/map/feature/etc. (stub)
&lt;/th&gt;&lt;th&gt;
</pre>
