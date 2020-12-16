/**
 * 
 * Copyright 2013
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 * 
 * @author Kalyan Mulampaka
 */
package com.mulampaka.spring.data.jdbc.codegen;
/**
 * Class to represent the method parameter name and type
 *
 * @author Kalyan Mulampaka
 *
 */
public class Parameter
{
    private String name;
    private String className;
    private ParameterType type;

    public Parameter (String name, ParameterType type)
    {
        this.name = name;
        this.type = type;
    }

    public Parameter (String name, String className, ParameterType type)
    {
        this.name = name;
        this.className = className;
        this.type = type;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public ParameterType getType ()
    {
        return type;
    }

    public void setType (ParameterType type)
    {
        this.type = type;
    }

    public String getClassName ()
    {
        return this.className;
    }

    public void setClassName (String className)
    {
        this.className = className;
    }

}
