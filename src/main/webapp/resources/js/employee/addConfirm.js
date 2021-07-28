$(document).ready(function () {
    $("#addConfirm").click(function () {
        add();
    });
});

function add() {
    $.ajax({
        type: 'POST',
        dataType: 'JSON',
        url: '/employee/addConfirmed',
        data: {
            Name: $('#Name').val(),
            Gender: $('#Gender').val(),
            Address: $('#Address').val(),
            PhoneNumber: $('#PhoneNumber').val(),
            Birth: $('#Birth').val(),
            Email: $('#Email').val()
        },
        success: function (data) {
            confirm("success");
            if (data == "ok") {
                window.location.assign("/emloyee/index");
            }
        }
    });
}