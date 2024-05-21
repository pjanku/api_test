let firstNumber = 0;
let operator = '';
let secondNumber = 0;
let finish = false;

const serverAddress = "localhost:8080";

$(document).ready(function() {
    let inResult = $("#inResult");
    $("#btnEqual").click(function(){
        console.log(firstNumber);
        if ( firstNumber !== 0){
            secondNumber = parseInt(inResult.val());
            if (operator === '+' ){
                $("#inResult").val(firstNumber + secondNumber);
                makePost(firstNumber, secondNumber, "+", firstNumber+secondNumber);
            } else if (operator === '-' ){
                $("#inResult").val(firstNumber - secondNumber);
                makePost(firstNumber, secondNumber, "-", firstNumber-secondNumber);
            }else if (operator === '*' ){
                $("#inResult").val(firstNumber * secondNumber);
                makePost(firstNumber, secondNumber, "*", firstNumber*secondNumber);
            }else if (operator === '/' ){
                $("#inResult").val(firstNumber / secondNumber);
                makePost(firstNumber, secondNumber, "/", firstNumber/secondNumber);
            }
        }
        finish = true;
    });

    $("#btnRequest").click(function()  {
        $("#histTabBody").empty();
        $.ajax({
            url: "http://localhost:8080/api/history_records"
        }).then(function(data) {
            for (let rec of data){
                makeNewRow(rec);
            }
            $('.greeting-id').append(data.id);
            $('.greeting-content').append(data.content);
        });
    });
});


function makePost(n1, n2, op, rs){
    $.ajax({
        type:"POST",
        url:"http://localhost:8080/api/history_records",
        data: JSON.stringify({
            number1:n1,
            number2:n2,
            operator: op,
            result: rs
        }),
        contentType: "application/json; charset=utf-8",
        dataType: "json"
    });

}


function  makeNewRow(data){
    let row = "<tr>";
    row += "<td>" + data.id + "</td>";
    row += "<td>" + data.number1 + "</td>";
    row += "<td>" + data.number2 + "</td>";
    row += "<td>" + data.operator + "</td>";
    row += "<td>" + data.result + "</td>";
    row += "<td>" + data.timestamp + "</td>";
    row += "</tr>";
    $("#histTabBody").append(row);
}

function numberClick(number) {
    let inResult = $("#inResult");
    if (finish === true){
        inResult.val("");
        finish = false;
    }
    if (inResult.val() === "0"){
        inResult.val("");
    }
    inResult.val( inResult.val() + number);
}

function plusClick(){
    let inResult = $("#inResult");
    firstNumber = parseInt( inResult.val());
    operator = '+';
    inResult.val(0);
}
function minusClick(){
    let inResult = $("#inResult");
    firstNumber = parseInt( inResult.val());
    operator = '-';
    inResult.val(0);
}
function divideClick(){
    let inResult = $("#inResult");
    firstNumber = parseInt( inResult.val());
    operator = '/';
    inResult.val(0);
}
function multiplyClick(){
    let inResult = $("#inResult");
    firstNumber = parseInt( inResult.val());
    operator = '*';
    inResult.val(0);
}