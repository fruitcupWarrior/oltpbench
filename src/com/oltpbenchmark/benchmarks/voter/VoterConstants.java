/******************************************************************************
 *  Copyright 2015 by OLTPBenchmark Project                                   *
 *                                                                            *
 *  Licensed under the Apache License, Version 2.0 (the "License");           *
 *  you may not use this file except in compliance with the License.          *
 *  You may obtain a copy of the License at                                   *
 *                                                                            *
 *    http://www.apache.org/licenses/LICENSE-2.0                              *
 *                                                                            *
 *  Unless required by applicable law or agreed to in writing, software       *
 *  distributed under the License is distributed on an "AS IS" BASIS,         *
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  *
 *  See the License for the specific language governing permissions and       *
 *  limitations under the License.                                            *
 ******************************************************************************/



package com.oltpbenchmark.benchmarks.voter;

import com.oltpbenchmark.util.DBName;

public abstract class VoterConstants {

	public static final int MAX_VOTES = 1000; 
	public static final int NUM_CONTESTANTS = 6; 
	
	public static final String SCHEMA_NAME = null;
	public static final DBName TABLENAME_CONTESTANTS = new DBName(SCHEMA_NAME, "CONTESTANTS");
	public static final DBName TABLENAME_LOCATIONS = new DBName(SCHEMA_NAME, "AREA_CODE_STATE");
	
	// Initialize some common constants and variables
    public static final String CONTESTANT_NAMES_CSV = "Edwina Burnam,Tabatha Gehling,Kelly Clauss,Jessie Alloway," +
											   "Alana Bregman,Jessie Eichman,Allie Rogalski,Nita Coster," +
											   "Kurt Walser,Ericka Dieter,Loraine NygrenTania Mattioli";
}
