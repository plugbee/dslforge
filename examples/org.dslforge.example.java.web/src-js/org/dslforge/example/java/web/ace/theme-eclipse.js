/* ***** BEGIN LICENSE BLOCK *****
 * Distributed under the BSD license:
 *
 * Copyright (c) 2010, Ajax.org B.V.
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of Ajax.org B.V. nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL AJAX.ORG B.V. BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * ***** END LICENSE BLOCK ***** */

define('ace/theme/eclipse', ['require', 'exports', 'module' , 'ace/lib/dom'], function(require, exports, module) {


exports.isDark = false;
exports.cssText = ".ace-eclipse .ace_gutter {\
background: #ebebeb;\
border-right: 1px solid rgb(159, 159, 159);\
color: rgb(136, 136, 136);\
}\
.ace_gutter-cell.ace_error {\
background-image: url(\"data:image/png;base64,R0lGODlhEAAQAOYAAPJcX/NjZvNkZ/WHiPBPVvBQV+5YXfJbX/FbYPJnbO9uc+ttcfBzd/V6f/V8gO1HUfFNVvFOVt1KVN5LU99PV/VtdfRtdbsSIMIfK84pOMYrNu47SNE4Rd1ATfFOWutVYPRgbdNWX9xpcsgWKcgYKsgYK8gZK8IcLeQvQNdjbt92gc4iOd+apeartcpdSc5uXsJbTPeJgPeimslHPvZ/efaAefaIgOBhW/V2cvN5dO15dfiLiPGMifJmZvNvbe2CgPeLifCHhf+/v9u2tuPExP///////wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACH5BAEAAEYALAAAAAAQABAAAAe6gEaCg4SFhUMwLjMzLi9EhkYvMzc/MjI/NzMvhTAzPDY1OTk0MTozMINDM0E4PkU+sK9BM0OCIhQ7PT1CRT1FQj1AFCGCHAsCBwAARb8IBwELHIIkDhDWEMwQEREFDiWCIyAo47xF4+MeI8UfGxu87kXtGx/SRiIdFg9FD/xCQg8VOogQ1GKFggQEEipMoCBDi0EqMjBoYKCigQYMMqgopOLEhAUDBiyQgCEFJBYhNFwwwSEEC0gwCwUCADs=\");\
background-repeat: no-repeat;\
background-position: 2px center;\
}\
.ace_gutter-cell.ace_warning {\
background-image: url(\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAACXBIWXMAAAsTAAALEwEAmpwYAAACIklEQVQ4y6WTTUtVURSGn33O9V7N24ehJCSZYAVREPQxKEiyQUFBGUHQMKEQGkVBYARB5KhBBI6jUSMHTRrlj6hJWFCBgaD51T33nLPXWns3uFfUsQsW7Mnz7ne9a28XY2QnlbDDqgCEH4/BOcABEUIgWhjGbAaVOqI3oshXRECUKAKqdFz/2HYQNzq04BAghLdJz82TSe/YUDR7jxmYEU3ZOG+O0AbbN4OFUVc9etWlGc4tk9RPnELtbuXSB9A2bPmmQLRANCOqgSmoTrlqDxTfofyFq1VA9YV8GquiCtokanOLgxbUatHbrnbsnHOrTNyZ5t7YNC6u4fYdGUb1Ppq3YGluhohoK9IQUkKYcntS0JwLl/dgKmBC0ukJkk9Gzd4hWQPJtjgQJXpPFBl3uw4Pu+IL5At0JV10xhrkf3GNbyS9/f1I9gjJ2CYQxYNIHe+fO1agbIAWdNc66K7VQDPIV0iTBfCNJ1EafXGbAy9Q+odu96GDzi9AWYLPOD96lotXzoBfBlmDfJ6kf6CO/ze54aACEL3fTwxPUxahaIKVECMzrz5juTL+bAh0HaygUssxKSYw3gA/2yH6l0nvwF5X/AHfgOAhGtcenIYgoPMg663dh1Uqg4NVmfv9GrjVEvDZSJIugRWQKjgFl9N3oBtChKyADgdpCs6TVpcQY2TLCOuzMrd4HCvBPFhJDNp631aCz0GMGAADgkJkFsDt9Dv/B+EoTqLuNGpyAAAAAElFTkSuQmCC\");\
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
.ace-eclipse .ace_print-margin {\
width: 1px;\
background: #ebebeb;\
}\
.ace-eclipse {\
background-color: #FFFFFF;\
}\
.ace-eclipse .ace_fold {\
background-color: rgb(60, 76, 114);\
}\
.ace-eclipse .ace_cursor {\
border-left: 2px solid black;\
}\
.ace-eclipse .ace_storage,\
.ace-eclipse .ace_keyword,\
.ace-eclipse .ace_variable {\
font-weight: bold;\
color: rgb(120, 0, 45);\
}\
.ace-eclipse .ace_constant.ace_buildin {\
color: rgb(88, 72, 246);\
}\
.ace-eclipse .ace_constant.ace_library {\
color: rgb(6, 150, 14);\
}\
.ace-eclipse .ace_function {\
color: rgb(60, 76, 114);\
}\
.ace-eclipse .ace_string {\
color: rgb(42, 0, 255);\
}\
.ace-eclipse .ace_comment {\
color: rgb(113, 150, 130);\
}\
.ace-eclipse .ace_comment.ace_doc {\
color: rgb(63, 95, 191);\
}\
.ace-eclipse .ace_comment.ace_doc.ace_tag {\
color: rgb(127, 159, 191);\
}\
.ace-eclipse .ace_constant.ace_numeric {\
color: darkblue;\
}\
.ace-eclipse .ace_tag {\
color: rgb(25, 118, 116);\
}\
.ace-eclipse .ace_type {\
color: rgb(127, 0, 127);\
}\
.ace-eclipse .ace_xml-pe {\
color: rgb(104, 104, 91);\
}\
.ace-eclipse .ace_marker-layer .ace_selection {\
background: rgb(181, 213, 255);\
}\
.ace-eclipse .ace_marker-layer .ace_bracket {\
margin: -1px 0 0 -1px;\
border: 1px solid rgb(192, 192, 192);\
}\
.ace-eclipse .ace_meta.ace_tag {\
color:rgb(25, 118, 116);\
}\
.ace-eclipse .ace_invisible {\
color: #ddd;\
}\
.ace-eclipse .ace_entity.ace_other.ace_attribute-name {\
color:rgb(127, 0, 127);\
}\
.ace-eclipse .ace_marker-layer .ace_step {\
background: rgb(255, 255, 0);\
}\
.ace-eclipse .ace_marker-layer .ace_active-line {\
background: rgb(232, 242, 254);\
}\
.ace-eclipse .ace_marker-layer .ace_selected-word {\
border: 1px solid rgb(181, 213, 255);\
}\
.ace-eclipse .ace_indent-guide {\
background: url(\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAACCAYAAACZgbYnAAAAE0lEQVQImWP4////f4bLly//BwAmVgd1/w11/gAAAABJRU5ErkJggg==\") right repeat-y;\
}";

exports.cssClass = "ace-eclipse";

var dom = require("../lib/dom");
dom.importCssString(exports.cssText, exports.cssClass);
});
