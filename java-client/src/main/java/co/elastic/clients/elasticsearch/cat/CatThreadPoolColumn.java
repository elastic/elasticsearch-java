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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

/**
 *
 * @see <a href="../doc-files/api-spec.html#cat._types.CatThreadPoolColumn">API
 *      specification</a>
 */
@JsonpDeserializable
public enum CatThreadPoolColumn implements JsonEnum {
	/**
	 * Number of active threads in the current thread pool.
	 */
	Active("active", "a"),

	/**
	 * Number of tasks completed by the thread pool executor.
	 */
	Completed("completed", "c"),

	/**
	 * Configured core number of active threads allowed in the current thread pool.
	 */
	Core("core", "cr"),

	/**
	 * Ephemeral node ID.
	 */
	EphemeralId("ephemeral_id", "eid"),

	/**
	 * Hostname for the current node.
	 */
	Host("host", "h"),

	/**
	 * IP address for the current node.
	 */
	Ip("ip", "i"),

	/**
	 * Configured keep alive time for threads.
	 */
	KeepAlive("keep_alive", "k"),

	/**
	 * Highest number of active threads in the current thread pool.
	 */
	Largest("largest", "l"),

	/**
	 * Configured maximum number of active threads allowed in the current thread
	 * pool.
	 */
	Max("max", "mx"),

	/**
	 * Name of the thread pool, such as <code>analyze</code> or
	 * <code>generic</code>.
	 */
	Name("name"),

	/**
	 * ID of the node, such as <code>k0zy</code>.
	 */
	NodeId("node_id", "id"),

	/**
	 * Node name, such as <code>I8hydUG</code>.
	 */
	NodeName("node_name"),

	/**
	 * Process ID of the running node.
	 */
	Pid("pid", "p"),

	/**
	 * Number of threads in the current thread pool.
	 */
	PoolSize("pool_size", "psz"),

	/**
	 * Bound transport port for the current node.
	 */
	Port("port", "po"),

	/**
	 * Number of tasks in the queue for the current thread pool.
	 */
	Queue("queue", "q"),

	/**
	 * Maximum number of tasks permitted in the queue for the current thread pool.
	 */
	QueueSize("queue_size", "qs"),

	/**
	 * Number of tasks rejected by the thread pool executor.
	 */
	Rejected("rejected", "r"),

	/**
	 * Configured fixed number of active threads allowed in the current thread pool.
	 */
	Size("size", "sz"),

	/**
	 * Type of thread pool. Returned values are <code>fixed</code>,
	 * <code>fixed_auto_queue_size</code>, <code>direct</code>, or
	 * <code>scaling</code>.
	 */
	Type("type", "t"),

	;

	private final String jsonValue;
	private final String[] aliases;

	CatThreadPoolColumn(String jsonValue, String... aliases) {
		this.jsonValue = jsonValue;
		this.aliases = aliases;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public String[] aliases() {
		return this.aliases;
	}

	public static final JsonEnum.Deserializer<CatThreadPoolColumn> _DESERIALIZER = new JsonEnum.Deserializer<>(
			CatThreadPoolColumn.values());
}
