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

package com.uni.se.jocl.expressions.sql.functions;

import java.util.List;

import com.uni.se.jocl.expressions.Expression;
import com.uni.se.jocl.expressions.sql.LiteralParam;
import com.uni.se.jocl.expressions.sql.SqlFunctionExp;
import com.uni.se.jocl.types.Type;
import com.uni.se.jocl.visit.ParserVisitable;
import com.uni.se.jocl.visit.ParserVisitor;

public class SqlFnTimestampdiff extends SqlFunctionExp implements ParserVisitable {

    public SqlFnTimestampdiff(String name, List<Expression> params, List<LiteralParam> literalParams) {
        super(name, params, literalParams);
        super.setType(new Type("Integer"));
    }

    @Override
    public void accept(ParserVisitor visitor) {
        visitor.visit(this);
    }

}