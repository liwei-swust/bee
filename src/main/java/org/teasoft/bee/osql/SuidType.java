/*
 * Copyright 2016-2020 the original author.All rights reserved.
 * Kingstar(honeysoft@126.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.teasoft.bee.osql;

/**
 * 数据库Suid操作类型.Database Suid type.
 * @author Kingstar
 * @since  1.4
 */
public enum SuidType {
	
	SELECT("SELECT"),UPDATE("UPDATE"),INSERT("INSERT"),DELETE("DELETE"),
	MODIFY("MODIFY"); //UPDATE,INSERT,DELETE
	
	private String type;
	
	SuidType(String type){
		this.type=type;
	}

	public String getType() {
		return type;
	}

}
