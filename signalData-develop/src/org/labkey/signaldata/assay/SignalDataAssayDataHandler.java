/*
 * Copyright (c) 2016 LabKey Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.labkey.signaldata.assay;

import org.jetbrains.annotations.Nullable;
import org.labkey.api.exp.api.DataType;
import org.labkey.api.study.assay.AbstractAssayTsvDataHandler;
import org.labkey.api.study.assay.AssayDataType;
import org.labkey.api.util.FileType;

/**
 * Created by Nick Arnold on 10/13/2015.
 */
public class SignalDataAssayDataHandler extends AbstractAssayTsvDataHandler
{
    public static final String NAMESPACE = "SignalDataAssayData";
    private static final AssayDataType DATA_TYPE = new AssayDataType(NAMESPACE, new FileType(".signaldatameta"));

    @Override
    protected boolean allowEmptyData()
    {
        return true;
    }

    @Override
    protected boolean shouldAddInputMaterials()
    {
        return false;
    }

    @Nullable
    @Override
    public DataType getDataType()
    {
        return DATA_TYPE;
    }
}
