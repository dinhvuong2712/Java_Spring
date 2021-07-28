$(document).ready(function () {
    var currentURL = $(location).attr('href');
    var id = currentURL.split('id=');
    localData(id[1]);
});
function localData(id) {
    $.ajax({
        type: 'GET',
        dataType: 'JSON',
        url: '/employee/getInfor?id=' + id,
        contentType: "application/json;charset=utf-8",
        success: function (data) {
            console.log(data);
            var html = "";
            html +=
                '<tr>'+
                    '<th class="pl-0 w-25" scope="row"><strong>ID</strong></th>' +
                    '<td>'+ data.Id_emp +'</td>' +
                '</tr>'+
                '<tr>' +
                    '<th class="pl-0 w-25" scope="row"><strong>Name</strong></th>' +
                    '<td>'+ data.Name +'</td>' +
                '</tr>'+
                '<tr>'+
                    '<th class="pl-0 w-25" scope="row"><strong>Gender</strong></th>' +
                    '<td>'+ data.Gender +'</td>' +
                '</tr>'+
                '<tr>'+
                    '<th class="pl-0 w-25" scope="row"><strong>Address</strong></th>' +
                    '<td>'+ data.Address +'</td>' +
                '</tr>'+
                '<tr>'+
                    '<th class="pl-0 w-25" scope="row"><strong>Phone Number</strong></th>' +
                    '<td>'+ data.PhoneNumber +'</td>' +
                '</tr>'+
                '<tr>'+
                    '<th class="pl-0 w-25" scope="row"><strong>Birth</strong></th>' +
                    '<td>'+ data.Birth +'</td>' +
                '</tr>'+
                '<tr>'+
                    '<th class="pl-0 w-25" scope="row"><strong>Email</strong></th>' +
                    '<td>'+ data.Email +'</td>' +
                '</tr>'+
                '<tr>'+
                    '<th class="pl-0 w-25" scope="row"><strong>Status</strong></th>' +
                    '<td>'+ data.Status +'</td>' +
                '</tr>'+
                '<tr>'+
                    '<th class="pl-0 w-25" scope="row"><strong>Created Date</strong></th>' +
                    '<td>'+ data.Created_date +'</td>' +
                '</tr>'+
                '<tr>'+
                    '<th class="pl-0 w-25" scope="row"><strong>Updated Date</strong></th>' +
                    '<td>'+ data.Updated_date +'</td>' +
                '</tr>'+
                '<div>'+
                    '<a class="btn btn-small btn-warning" href="/employee/update?id='+ data.Id_emp +'"><ion-icon name="hammer-outline"></ion-icon></a>' +
                    '<a class="btn btn-small btn-danger" href="/employee/delete?id='+ data.Id_emp +'"><ion-icon name="trash-outline"></ion-icon></a>' +
                '</div>';

            $('#dataTable tbody').empty().append(html);
        }
    });
}