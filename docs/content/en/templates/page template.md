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
nav_exclude: true
---
# Page Template
* Page Templates for peppypedia.
# Markdown
* All pages should always start with this:

```md
---
title: [page-template]
lastmod: [2022-11-17]
categories: [templates]
menu:
  docs:
    parent: "templates"
aliases: [format-template]
stub: [false]
peppypedia-old: [false]
peppypedia-current: [true]
 ---
```
# Stubs
if 'stub:' is marked [true] then this following example should be used:
```md
<table>
<tbody><tr>
<th>
This page does not list much information about this particular person/map/feature/etc. (stub)
</th><th>

## example
```
example:
<table>
<tbody><tr>
<th>
This page does not list much information about this particular person/map/feature/etc. (stub)
</th><th>

# example
example
</table>
</tbody>
</tr>
</th>
