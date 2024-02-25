---
title: API docs
layout: minimal
nav_exclude: true
---

<title peppypedia API></title>

<center><h1>peppypedia API</h1></center>

peppypedia API documention\
Notes: `page creator` value exists only when the `author` value is set to `none` or `unknown`. Please state an username on the pull request body. An exception to this is if the following is already added before the metadata:
 ```md
 <t><center>[Your username, do not remove brackets](https://osu.ppy.sh/users/0)</center>
<link rel="stylesheet" href="../profile.css"></t>

![Your username, do not remove brackets](https://a.ppy.sh/0.jpeg#author "Your username")
```

Should we fail to verify that the user profile linked belongs to you, a direct message will be sent to the user in question. If chat message are set to friends-only, we ask that you temporary allow direct messages from anyone, or direct message [Windows Me](<https://osu.ppy.sh/users/28893698>) yourself.

If the page is a documention page or a parent page, author values aren't required (and should not be added for the former). Should a page be entirely rewritten, the author value will change.

<center><h2>Users</h2></center>

if `exists` is set to value `true`, this indicates that the endpoint exists. markup value should always be `html/markdown`. `group` can be have multiple values:

```json
"group":"ppy" = peppy
"group":"SPT" = Support Team
"group":"Support Team" = Support Team
"group":"GMT" = Global Moderation Team
"group":"Global Moderation Team" = Global Moderaton Team
"group":"NAT" = Nomination Assessment Team
"group":"Nomination Assessment Team" = Nomination Assessment Team
(note: "mode" + gamemode should be inputted after if the group is set to BN, TrialBN, NAT, or BSC)
"group":"TrialBN" = Trial Beatmap Nominator
"group":"Trial Beatmap Nominator" = Trial Beatmap Nomnator
(note: "mode" + gamemode should be inputted after if the group is set to BN, TrialBN, NAT, or BSC)
"group":"BN" = Beatmap Nominator
"group":"Beatmap Nominator" = Beatmap Nominator
(note: "mode" + gamemode should be inputted after if the group is set to BN, TrialBN, NAT, or BSC)
"group":"DEV" = Developer
"group":"Developer" = Developer
"group":"BSC" = Beatmap Spotlight Curators
"group":"Beatmap Spotlight Curators" = Beatmap Spotlight Curators
(note: "mode" + gamemode should be inputted after if the group is set to BN, TrialBN, NAT, or BSC)
```


```sh
curl --request GET \
    --get "https://milotilo.ddns.net/peppypedia/api/peppy.json" \
    --header "Content-Type: application/XML" \
    --header "Accept: application/XML"
```

response:

```json
{"exists":"true","name":"peppy","markup":"html/markdown","group":"ppy","author":"Windows_Me"}
```

API progress can be seen [here](index.ts.json).\
page completion progress can be seen [here](api.xml)
