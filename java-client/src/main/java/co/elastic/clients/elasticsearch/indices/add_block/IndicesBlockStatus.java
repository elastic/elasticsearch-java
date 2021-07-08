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

package co.elastic.clients.elasticsearch.indices.add_block;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: indices.add_block.IndicesBlockStatus
public final class IndicesBlockStatus implements ToJsonp {
	private final String name;

	private final Boolean blocked;

	// ---------------------------------------------------------------------------------------------

	protected IndicesBlockStatus(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");
		this.blocked = Objects.requireNonNull(builder.blocked, "blocked");

	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code blocked}
	 */
	public Boolean blocked() {
		return this.blocked;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("blocked");
		generator.write(this.blocked);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndicesBlockStatus}.
	 */
	public static class Builder implements ObjectBuilder<IndicesBlockStatus> {
		private String name;

		private Boolean blocked;

		/**
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code blocked}
		 */
		public Builder blocked(Boolean value) {
			this.blocked = value;
			return this;
		}

		/**
		 * Builds a {@link IndicesBlockStatus}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndicesBlockStatus build() {

			return new IndicesBlockStatus(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for IndicesBlockStatus
	 */
	public static final JsonpDeserializer<IndicesBlockStatus> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, IndicesBlockStatus::setupIndicesBlockStatusDeserializer);

	protected static void setupIndicesBlockStatusDeserializer(DelegatingDeserializer<IndicesBlockStatus.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::blocked, JsonpDeserializer.booleanDeserializer(), "blocked");

	}

}
