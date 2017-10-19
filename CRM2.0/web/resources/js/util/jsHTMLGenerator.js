/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function jsTableGenerator() {
    this.tbodyGenerator = function () {
        var rows = [];
        this.addRow = function (rowAttr, columns) {
            var tr = $('<tr>', (rowAttr !== undefined && rowAttr !== null) ? rowAttr : {});
            for (var i = 0; i < columns.size; i++) {
                var column = columns[i];
                var td = $('<td>', (column.attr !== undefined && column.attr !== null) ? column.attr : {});
                tr.append(td);
            }
            rows.push($(tr)[0].outerHTML);
        };
        this.getHTML = function () {
            var out = "";
            for (var i = 0; i < rows.length; i++) {
                out += rows[i];
            }
            return out;
        };
    };

}

function jsFormModalGenerator() {

    var modal_content = $('<div>', {
        'class': 'modal-content'
    });
    var modal_footer = $('<div', {
        'class': 'modal-footer'
    });

    this.setContent = function (content) {
        if (content.title !== undefined && content.title !== null) {
            modal_content.append('<h4>' + content.title + '</h4>');
        }
        modal_content.append(content.body);
    };
    this.setFooter = function (footer) {
        modal_footer.append(footer);
    };
    this.getHTML = function (id) {
        var props = {
            'class': 'modal'
        };
        if (id !== undefined && id !== null) {
            props.id = id;
        }
        var modal = $('<div>', props);
        $(modal).append(modal_content);
        $(modal).append(modal_footer);
        return $(modal)[0].outerHTML;
    };
}

