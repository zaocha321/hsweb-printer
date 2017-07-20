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

package org.hsweb.printer.fx.component.propertys.panels.anchor;

import org.hsweb.printer.fx.component.components.panels.AnchorPaneComponent;
import org.hsweb.printer.fx.component.propertys.dtos.PropertysDTO;
import org.hsweb.printer.fx.component.propertys.panels.AnchorPaneComponentProperty;
import org.hsweb.printer.utils.printable.templateptint.TemplatePrintConstants;
import org.hsweb.printer.utils.printable.templateptint.dtos.ForPanelComponentDTO;

/**
 * Created by xiong on 2017-07-19.
 */
public class ForComponentProperty extends AnchorPaneComponentProperty<AnchorPaneComponent,ForPanelComponentDTO> {


    @Override
    public String getType() {
        return TemplatePrintConstants.FOR;
    }


    @Override
    public void posComponentProperty(PropertysDTO propertys, AnchorPaneComponent basicComponent, ForPanelComponentDTO baseComponentDTO) {
        this.pubContextProperty("变量");
        this.pubWidthProperty();
        this.pubHeightProperty();
    }
}