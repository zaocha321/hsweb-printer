/*
 *  Copyright (c) 2015.  meicanyun.com Corporation Limited.
 *  All rights reserved.
 *
 *  This software is the confidential and proprietary information of
 *  meicanyun Company. ("Confidential Information").  You shall not
 *  disclose such Confidential Information and shall use it only in
 *  accordance with the terms of the license agreement you entered into
 *  with meicanyun.com.
 */

package org.hsweb.printer.fx.components.propertys.elements.text;

import org.hsweb.printer.fx.components.components.elements.TextViewComponent;
import org.hsweb.printer.fx.components.propertys.dtos.PropertysDTO;
import org.hsweb.printer.fx.components.propertys.elements.TextViewElementComponentProperty;
import org.hsweb.printer.utils.printable.templateptint.TemplatePrintConstants;
import org.hsweb.printer.utils.printable.templateptint.dtos.VariableComponentDTO;

/**
 * Created by xiong on 2017-07-19.
 */
public class VariableElementComponentPoroperty extends TextViewElementComponentProperty<TextViewComponent,VariableComponentDTO> {
    @Override
    public String getType() {
        return TemplatePrintConstants.VARIABLE;
    }

    @Override
    public void textComponentProperty(PropertysDTO propertys, TextViewComponent basicComponent, VariableComponentDTO baseComponentDTO) {
        this.pubAll("变量");
        this.fontAll();
    }
}