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
<table>
  <th>
&lt;table&gt;
<p>&lt;tbody&gt;&lt;tr&gt;</p>
<p>&lt;th&gt;</p>
  <p>This page does not list much information about this particular person/map/feature/etc. (stub)</p>
  <p>&lt;/th&gt;&lt;th&gt;</p>
  </th>
</table>
  <p><b>Reminder to un-indent any elements to avoid breaking.</p>
