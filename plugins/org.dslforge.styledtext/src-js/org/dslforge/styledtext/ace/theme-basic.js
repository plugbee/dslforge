/**
 * <copyright>
 *
 * Copyright (c) 2016 PlugBee. All rights reserved.
 * 
 * This program and the accompanying materials are made available 
 * under the terms of the basictext Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.basictext.org/legal/epl-v10.html
 *
 * Contributors:
 *     PlugBee - Initial API and implementation
 *
 * </copyright>
 */
define('ace/theme/basic', ['require', 'exports', 'module' , 'ace/lib/dom'], function(require, exports, module) {

exports.isDark = false;
exports.cssText = ".ace-basic .ace_gutter {\
background: #ebebeb;\
border-right: 1px solid rgb(159, 159, 159);\
color: rgb(136, 136, 136);\
}\
.ace_gutter-cell.ace_error {\
background-image: url(\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAMAAAAoLQ9TAAAAwFBMVEX1b3L1h4j1bnL0bnPrbXH1en/dSlTeS1PfT1fxWWPyYWjOKDfOKTjROEXdQE3yS1rrVWD0YG3caXLIFijIGSrOJTXxP1LxP1Pmq7XKXUnObl73oprJRz7gYVv3iYX1eXn2goDtgoD/v7/jxMT///////8AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABQyqZXAAAAJnRSTlP/////////////////////////////////////////////////AKd6gbwAAAABYktHRD8+YzB1AAAACXBIWXMAAABIAAAASABGyWs+AAAAhElEQVQY033P0Q6CMAwF0IlTYDoGQ93AwUZ3/f9fVELjgzE0fenJTdOK10+J/5DHIQxj/kIO0/JcppAZcpiRUsK8ygq2ioQIipXdQMtCAHQspN6g7x4OcM51PSdaQ4AxpuWEbQj1p+uGd/g7lFKE09XzHf5SyoM8rzNf6q2+aet3ftmDN4SUHrUM7ydVAAAAAElFTkSuQmCC\");\
background-repeat: no-repeat;\
background-position: 2px center;\
}\
.ace_gutter-cell.ace_warning {\
background-image: url(\"data:image/png;base64,R0lGODlhEAAQANUAAP/bcv/egf/ijf/ij//klv/jl//lnf/mnv/uwf/IWv/Na//Qc//Ugf/Vgv/Vg//cl//enf/nuP/MbHtRE4BVFYJXFoFVFolbGIdbGIxeGpRkHcWDLcmHL8aELsaFLs2LMsmHMcuKM82LNdyYP9+bQuCcQ+GlVcuHMc+LNdGNNtuXQN+aQt2ZQuOwcOfMrv///////wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACH5BAEAADAALAAAAAAQABAAAAZuQJhwSCwaj0jha/lKKl2lkquZfK0QCBL1+HKxIhHWFPkaISYThGpLfJlSDkrFkTKxlSJA45JhAFB3bh8BCYUJASF2bSACEg8YGg8KAydsLxwECxAWGBALBRyWHS0GB6amLR6BG6ytrHdKTLJOTkEAOw==\");\
background-position: 2px center;\
}\
.ace_gutter-cell.ace_info {\
background-image: url(\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQBAMAAADt3eJSAAAAMFBMVEUCRowES5EETJEIVJgLXZ8MXJ+cvtoOYqT///8AAAAAAAAAAAAAAAAAAAAAAAAAAADV3NoRAAAACXRSTlP//////////wBTT3gSAAAAAWJLR0QPGLoA2QAAAAlwSFlzAAAASAAAAEgARslrPgAAAC1JREFUCNdj6IACBmRGexk6Ay5VjiHV6gZlNJtBGY1qUEYDGzqDgSEDzUBUBgBkukBcflrvMwAAAABJRU5ErkJggg==\");\
background-position: 2px center;\
}\
.ace_tooltip {\
background-color: #ffffe1;\
background-image: none;\
border: 1px solid gray;\
border-radius: 1px;\
box-shadow: 0 1px 2px rgba(0, 0, 0, 0.3);\
color: black;\
max-width: 100%;\
padding: 3px 4px;\
position: fixed;\
z-index: 999999;\
-moz-box-sizing: border-box;\
-webkit-box-sizing: border-box;\
box-sizing: border-box;\
cursor: default;\
white-space: pre;\
word-wrap: break-word;\
line-height: normal;\
font-style: normal;\
font-weight: normal;\
font-size: 14px;\
letter-spacing: normal;\
pointer-events: none;\
}\
.ace-basic .ace_print-margin {\
width: 1px;\
background: #ebebeb;\
}\
.ace-basic {\
background-color: #FFFFFF;\
}\
.ace-basic .ace_fold {\
background-color: rgb(60, 76, 114);\
}\
.ace-basic .ace_cursor {\
border-left: 2px solid black;\
}\
.ace-basic .ace_storage,\
.ace-basic .ace_keyword,\
.ace-basic .ace_variable {\
font-weight: bold;\
color: rgb(120, 0, 45);\
}\
.ace-basic .ace_constant.ace_buildin {\
color: rgb(88, 72, 246);\
}\
.ace-basic .ace_constant.ace_library {\
color: rgb(6, 150, 14);\
}\
.ace-basic .ace_function {\
color: rgb(60, 76, 114);\
}\
.ace-basic .ace_string {\
color: rgb(42, 0, 255);\
}\
.ace-basic .ace_comment {\
color: rgb(113, 150, 130);\
}\
.ace-basic .ace_comment.ace_doc {\
color: rgb(63, 95, 191);\
}\
.ace-basic .ace_comment.ace_doc.ace_tag {\
color: rgb(127, 159, 191);\
}\
.ace-basic .ace_constant.ace_numeric {\
color: darkblue;\
}\
.ace-basic .ace_tag {\
color: rgb(25, 118, 116);\
}\
.ace-basic .ace_type {\
color: rgb(127, 0, 127);\
}\
.ace-basic .ace_xml-pe {\
color: rgb(104, 104, 91);\
}\
.ace-basic .ace_marker-layer .ace_selection {\
background: rgb(181, 213, 255);\
}\
.ace-basic .ace_marker-layer .ace_bracket {\
margin: -1px 0 0 -1px;\
border: 1px solid rgb(192, 192, 192);\
}\
.ace-basic .ace_meta.ace_tag {\
color:rgb(25, 118, 116);\
}\
.ace-basic .ace_invisible {\
color: #ddd;\
}\
.ace-basic .ace_entity.ace_other.ace_attribute-name {\
color:rgb(127, 0, 127);\
}\
.ace-basic .ace_marker-layer .ace_step {\
background: rgb(255, 255, 0);\
}\
.ace-basic .ace_marker-layer .ace_active-line {\
background: rgb(232, 242, 254);\
}\
.ace-basic .ace_marker-layer .ace_selected-word {\
border: 1px solid rgb(181, 213, 255);\
}\
.ace-basic .ace_indent-guide {\
background: url(\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAACCAYAAACZgbYnAAAAE0lEQVQImWP4////f4bLly//BwAmVgd1/w11/gAAAABJRU5ErkJggg==\") right repeat-y;\
}\
.ace-completion { padding-left: 12px; position: relative; }\
.ace-completion:before { position: absolute; left: 0; bottom: 0; border-radius: 50%; font-weight: bold; height: 13px; width: 13px; font-size:11px; /*BYM*/ line-height: 14px; text-align: center; color: white; -moz-box-sizing: border-box; -webkit-box-sizing: border-box; box-sizing: border-box; }\
.ace-completion-unknown:before { content:'?'; background: #4bb; }\
.ace-completion-object:before { content:'R'; background: #77c; }\
.ace-completion-snippet:before { content:'T'; background: #7c7; }\
.ace-completion-keyword:before { content:'K'; background: #78002D; }\
.ace-completion-identifier:before { content:'I'; background: #c66; }\
.ace-completion-number:before { content:'1'; background: #999; }\
.ace-completion-string:before { content:'S'; background: #999; }\
.ace-completion-bool:before { content:'B'; background: #999; }\
";


exports.cssClass = "ace-basic";

var dom = require("../lib/dom");
dom.importCssString(exports.cssText, exports.cssClass);
});

