/**
 *
 *  Copyright 2005 The Apache Software Foundation or its licensors, as applicable.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.tuscany.das.rdb.impl;

import java.io.InputStream;

import org.apache.tuscany.das.rdb.DAS;
import org.apache.tuscany.das.rdb.DASFactory;
import org.apache.tuscany.das.rdb.config.Config;

public class DASFactoryImpl implements DASFactory {

	public DAS createDAS(InputStream configStream) {
		return new DASImpl(configStream);
	}

	public DAS createDAS(Config config) {
		return new DASImpl(config);
	}
	
	public DAS createDAS() {
		return new DASImpl();
	}


}