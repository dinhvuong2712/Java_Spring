$(document).ready(function () {
    localData();
});

function localData() {
    $.ajax({
        type: 'GET',
        dataType: 'JSON',
        url: '/employee/getAll',
        contentType: "application/json;charset=utf-8",
        success: function (data) {
            var html = "";
            $.each(data, function (i, e) {
                html +=
                    '<tr>' +
                        '<td>' + e.Id_emp + '</td>' +
                        '<td>' + e.Name + '</td>' +
                        '<td>' + getGender(e.Gender) + '</td>' +
                        '<td>' + e.Address + '</td>' +
                        '<td>' + e.PhoneNumber + '</td>' +
                        '<td>' + e.viewBirth + '</td>' +
                        '<td>' + e.Email + '</td>' +
                        '<td><a class="btn btn-small btn-infor infor" href="/employee/infor?id='+ e.Id_emp +'"><ion-icon name="ellipsis-horizontal-circle-outline"></ion-icon></a></td>' +
                        '<td><a class="btn btn-small btn-warning update" href="/employee/update?id='+ e.Id_emp +'"><ion-icon name="hammer-outline"></ion-icon></a></td>' +
                        '<td><button class="btn btn-small btn-danger del" datasrc="/employee/delete?id='+ e.Id_emp +'"><ion-icon name="trash-outline"></ion-icon></button></td>' +
                    '</tr>';
            });

            $('#employee-all tbody').empty().append(html);
            $("#employee-all tbody tr td .del").click(function () {
                var result = confirm("Do u want to del this item?");
                if(result){
                    window.location.assign($(this).attr("datasrc"));
                }
            })
        }
    });
}
