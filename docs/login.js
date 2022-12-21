const url = new URL(
    "https://osu.ppy.sh/oauth/token"
);

let headers = {
    "Accept": "application/json",
    "Content-Type": "application/json",
};

let body = {
    "client_id": 18792,
    "client_secret": "clientsecret",
    "code": "receivedcode",
    "grant_type": "authorization_code",
    "redirect_uri": "https://milotilo.ddns.net/peppypedia",
    "scope": "public"
}

fetch(url, {
    method: "POST",
    headers,
    body: JSON.stringify(body),
}).then(response => response.json());
