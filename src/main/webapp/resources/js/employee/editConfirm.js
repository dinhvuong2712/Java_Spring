$(document).ready(function (){
    var gender = $('#flexRadioDefault1').attr('data-gender');
    checked(gender);
    $('#Birth').val($('#Birth').val().toString().replace('/','-').toString());
    $("#updateConfirm").click(function () {
        // editConfirm();
    });
});

function editConfirm(){
    $.ajax({
        type: 'POST',
        dataType: 'JSON',
        url: '/employee/updateConfirmed',
        data: {
            Name: $('#Name').val(),
            Gender: $('#Gender').val(),
            Address: $('#Address').val(),
            PhoneNumber: $('#PhoneNumber').val(),
            Birth: $('#Birth').val(),
            Email: $('#Email').val()
        },
        success: function (data) {
            if(result == "ok"){
                location.replace('/employee/index');
            }
        }
    });
}
function message(mess){
    var url = $(location).href.split('message=');
    if(Boolean(url)){
        $("#exampleModal").attr("aria-hidden","false");
        $("#exampleModal").css("display","block !important");
    }
}
function checked(gender){
    if(gender){
        return $('#flexRadioDefault1').checked(true);
    }
    return $('#flexRadioDefault2').checked(true);
}