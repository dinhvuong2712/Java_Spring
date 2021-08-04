$(document).ready(function (){
    var gender = $('#flexRadioDefault1').attr('data-gender');
    checked(gender);
    $('#Birth').val($('#Birth').val().toString().replace('/','-').toString());
    $("#updateConfirm").click(function () {
        editConfirm();
    });
});

function editConfirm(){
    $.ajax({
        type: 'PUT',
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

function checked(gender){
    if(gender){
        return $('#flexRadioDefault1').checked;
    }
    return $('#flexRadioDefault2').checked;
}