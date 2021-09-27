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

package co.elastic.clients.elasticsearch.autoscaling.get_autoscaling_capacity;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: autoscaling.get_autoscaling_capacity.AutoscalingResources
@JsonpDeserializable
public final class AutoscalingResources implements JsonpSerializable {
	private final Integer storage;

	private final Integer memory;

	// ---------------------------------------------------------------------------------------------

	public AutoscalingResources(Builder builder) {

		this.storage = Objects.requireNonNull(builder.storage, "storage");
		this.memory = Objects.requireNonNull(builder.memory, "memory");

	}

	/**
	 * API name: {@code storage}
	 */
	public Integer storage() {
		return this.storage;
	}

	/**
	 * API name: {@code memory}
	 */
	public Integer memory() {
		return this.memory;
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

		generator.writeKey("storage");
		generator.write(this.storage);

		generator.writeKey("memory");
		generator.write(this.memory);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AutoscalingResources}.
	 */
	public static class Builder implements ObjectBuilder<AutoscalingResources> {
		private Integer storage;

		private Integer memory;

		/**
		 * API name: {@code storage}
		 */
		public Builder storage(Integer value) {
			this.storage = value;
			return this;
		}

		/**
		 * API name: {@code memory}
		 */
		public Builder memory(Integer value) {
			this.memory = value;
			return this;
		}

		/**
		 * Builds a {@link AutoscalingResources}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AutoscalingResources build() {

			return new AutoscalingResources(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AutoscalingResources}
	 */
	public static final JsonpDeserializer<AutoscalingResources> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AutoscalingResources::setupAutoscalingResourcesDeserializer, Builder::build);

	protected static void setupAutoscalingResourcesDeserializer(
			DelegatingDeserializer<AutoscalingResources.Builder> op) {

		op.add(Builder::storage, JsonpDeserializer.integerDeserializer(), "storage");
		op.add(Builder::memory, JsonpDeserializer.integerDeserializer(), "memory");

	}

}
