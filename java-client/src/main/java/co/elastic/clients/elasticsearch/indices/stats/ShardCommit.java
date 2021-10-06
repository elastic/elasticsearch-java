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

package co.elastic.clients.elasticsearch.indices.stats;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.stats.ShardCommit
@JsonpDeserializable
public final class ShardCommit implements JsonpSerializable {
	private final int generation;

	private final String id;

	private final long numDocs;

	private final Map<String, String> userData;

	// ---------------------------------------------------------------------------------------------

	public ShardCommit(Builder builder) {

		this.generation = Objects.requireNonNull(builder.generation, "generation");
		this.id = Objects.requireNonNull(builder.id, "id");
		this.numDocs = Objects.requireNonNull(builder.numDocs, "num_docs");
		this.userData = ModelTypeHelper.unmodifiableNonNull(builder.userData, "user_data");

	}

	public ShardCommit(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code generation}
	 */
	public int generation() {
		return this.generation;
	}

	/**
	 * Required - API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code num_docs}
	 */
	public long numDocs() {
		return this.numDocs;
	}

	/**
	 * Required - API name: {@code user_data}
	 */
	public Map<String, String> userData() {
		return this.userData;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("generation");
		generator.write(this.generation);

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("num_docs");
		generator.write(this.numDocs);

		generator.writeKey("user_data");
		generator.writeStartObject();
		for (Map.Entry<String, String> item0 : this.userData.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardCommit}.
	 */
	public static class Builder implements ObjectBuilder<ShardCommit> {
		private Integer generation;

		private String id;

		private Long numDocs;

		private Map<String, String> userData;

		/**
		 * Required - API name: {@code generation}
		 */
		public Builder generation(int value) {
			this.generation = value;
			return this;
		}

		/**
		 * Required - API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code num_docs}
		 */
		public Builder numDocs(long value) {
			this.numDocs = value;
			return this;
		}

		/**
		 * Required - API name: {@code user_data}
		 */
		public Builder userData(Map<String, String> value) {
			this.userData = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #userData(Map)}, creating the map if needed.
		 */
		public Builder putUserData(String key, String value) {
			if (this.userData == null) {
				this.userData = new HashMap<>();
			}
			this.userData.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link ShardCommit}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardCommit build() {

			return new ShardCommit(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardCommit}
	 */
	public static final JsonpDeserializer<ShardCommit> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ShardCommit::setupShardCommitDeserializer, Builder::build);

	protected static void setupShardCommitDeserializer(DelegatingDeserializer<ShardCommit.Builder> op) {

		op.add(Builder::generation, JsonpDeserializer.integerDeserializer(), "generation");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::numDocs, JsonpDeserializer.longDeserializer(), "num_docs");
		op.add(Builder::userData, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"user_data");

	}

}
