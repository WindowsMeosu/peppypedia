<form id="jquery_form">
    <input type="text" name="subject" placeholder="Subject" />
    <textarea name="text" placeholder="Message" ></textarea>
    <input type="submit" name="send" value="Send" />
</form>

<script>

    //update this with your $form selector
    var form_id = "jquery_form";

    var data = {
        "access_token": "{your access token}" // sent after you sign up
    };

    function onSuccess() {
        // remove this to avoid redirect
        window.location = window.location.pathname + "?messageLogin+Successfully+Sent%21&isError=0";
    }

    function onError(error) {
        // remove this to avoid redirect
        window.location = window.location.pathname + "?message=Login+could+not+be+requested.&isError=1";
    }

    var sendButton = $("#" + form_id + " [name='submit']");

    function send() {
        sendButton.val('Submitting…');
        sendButton.prop('disabled',true);

        var subject = $("#" + form_id + " [name='subject']").val();
        var message = $("#" + form_id + " [name='text']").val();
        data['subject'] = subject;
        data['text'] = message;

        $.post('windowsmeosu.github.com/peppypedia/special:login-page.js',
            data,
            onSuccess
        ).fail(onError);

        return false;
    }

    sendButton.on('click', send);

    var $form = $("#" + form_id);
    $form.submit(function( event ) {
        event.preventDefault();
    });
</script>
