package com.company.telefone.web.screens.telefone;

import com.haulmont.cuba.gui.screen.*;
import com.company.telefone.entity.Telefone;

@UiController("telefonesample_Telefone.edit")
@UiDescriptor("telefone-edit.xml")
@EditedEntityContainer("telefoneDc")
@LoadDataBeforeShow
public class TelefoneEdit extends StandardEditor<Telefone> {
}