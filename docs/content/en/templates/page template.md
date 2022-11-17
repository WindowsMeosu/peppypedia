---
title: [page-template]
lastmod: [2022-11-17]
categories: [templates]
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
* --- syntax is used at the top of the page at the all times.
Example:
<table border="1">
<table>
<td>
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
  </td>
  </table>
  <p><b>Note, this has to be vertical despite it not being vertical in the example</b></p>
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
  <p><b>Reminder to un-indent any elements to avoid breaking</p>
