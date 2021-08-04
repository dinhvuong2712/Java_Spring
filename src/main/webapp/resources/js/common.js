$(document).ready(function () {
    $('.date-default').val(getDateCurrent());
})

function getDateCurrent(){
    var date = new Date(),
        year = date.getFullYear(),
        numMonth = parseInt(date.getMonth()) +1,
        month = (numMonth < 10) ? ('0' + numMonth) : numMonth,
            day = date.getDay() < 10 ? ('0' + date.getDay()) : date.getDay();

    return year + '/' + month + '/' + day;
}

function getGender(isMale){
    if(isMale){
        return 'Nam';
    }
    return 'Nữ';
}