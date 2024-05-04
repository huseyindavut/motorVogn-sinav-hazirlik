
$(function () {
    hentBiler();
    console.log("araba fonskyionu ok")
})

function hentBiler() {
    $.get("henteBil", function (bils) {
        formatBiler(bils);
    })
}
    function formatBiler(bils) {
        let ut = "<select class='form-select' id='valgtMerke' onchange='finnType()'>";
        let lastMerke = ""
        for (const bil of bils) {
            if (bil.merke !== lastMerke) {
                ut += "<option>" + bil.merke + "</option>"
            }
            lastMerke = bil.merke;

        }
    ut += "</select>";
    $("#merke").html(ut);

}
    function finnType() {
    console.log("finnType basladi")
        let valgtMerke = $("#valgtMerke").val();
        $.get("henteBil", function (bils) {
            formatType(bils, valgtMerke);
        })
    }
    function formatType(bils,valgtMerke) {

            let ut="<select class='form-select' id='valgtType'>";
        for (const bil of bils) {
            if(bil.merke===valgtMerke){
                ut += "<option>" + bil.type + "</option>"
            }
        }
        ut += "</select>";
        $("#type").html(ut);
    }



