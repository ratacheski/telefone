package com.company.telefone.web.screens.telefone;

import com.haulmont.cuba.gui.screen.*;
import com.company.telefone.entity.Telefone;

@UiController("telefonesample_Telefone.browse")
@UiDescriptor("telefone-browse.xml")
@LookupComponent("telefonesTable")
@LoadDataBeforeShow
public class TelefoneBrowse extends StandardLookup<Telefone> {
}