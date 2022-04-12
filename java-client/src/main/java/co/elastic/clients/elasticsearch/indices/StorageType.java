/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices._types.StorageType">API
 *      specification</a>
 */
@JsonpDeserializable
public enum StorageType implements JsonEnum {
	/**
	 * Default file system implementation. This will pick the best implementation
	 * depending on the operating environment, which is currently hybridfs on all
	 * supported systems but is subject to change.
	 */
	Fs("fs", ""),

	/**
	 * The NIO FS type stores the shard index on the file system (maps to Lucene
	 * NIOFSDirectory) using NIO. It allows multiple threads to read from the same
	 * file concurrently. It is not recommended on Windows because of a bug in the
	 * SUN Java implementation and disables some optimizations for heap memory
	 * usage.
	 */
	Niofs("niofs"),

	/**
	 * The MMap FS type stores the shard index on the file system (maps to Lucene
	 * MMapDirectory) by mapping a file into memory (mmap). Memory mapping uses up a
	 * portion of the virtual memory address space in your process equal to the size
	 * of the file being mapped. Before using this class, be sure you have allowed
	 * plenty of virtual address space.
	 */
	Mmapfs("mmapfs"),

	/**
	 * The hybridfs type is a hybrid of niofs and mmapfs, which chooses the best
	 * file system type for each type of file based on the read access pattern.
	 * Currently only the Lucene term dictionary, norms and doc values files are
	 * memory mapped. All other files are opened using Lucene NIOFSDirectory.
	 * Similarly to mmapfs be sure you have allowed plenty of virtual address space.
	 */
	Hybridfs("hybridfs"),

	;

	private final String jsonValue;
	private final String[] aliases;

	StorageType(String jsonValue, String... aliases) {
		this.jsonValue = jsonValue;
		this.aliases = aliases;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public String[] aliases() {
		return this.aliases;
	}

	public static final JsonEnum.Deserializer<StorageType> _DESERIALIZER = new JsonEnum.Deserializer<>(
			StorageType.values());
}
