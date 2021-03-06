/**************************************************************************
Copyright 2022 

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

@author: Anonymous Author(s)
***************************************************************************/

package com.uni.se.jocl.types;

public class TupleType extends DataType {
    public final TypeEnum TYPE = TypeEnum.TUPLETYPE;

    @Override
    public boolean conformsTo(Classifier other) {
        if (this == other)
            return true;
        if (other == null)
            return false;
        if (other instanceof AnyType)
            return true;
        if (other instanceof TupleType)
            // TODO: Further investigation on tuple in Java
            // But apparently they did not support tuple in SE 8
            // https://stackoverflow.com/questions/24328679/does-java-se-8-have-pairs-or-tuples
            return true;
        return false;
    }

}
