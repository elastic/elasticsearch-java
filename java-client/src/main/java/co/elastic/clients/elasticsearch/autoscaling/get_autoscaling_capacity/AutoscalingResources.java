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

package co.elastic.clients.elasticsearch.autoscaling.get_autoscaling_capacity;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;

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

// typedef: autoscaling.get_autoscaling_capacity.AutoscalingResources

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#autoscaling.get_autoscaling_capacity.AutoscalingResources">API
 *      specification</a>
 */
@JsonpDeserializable
public class AutoscalingResources implements JsonpSerializable {
	private final int storage;

	private final int memory;

	// ---------------------------------------------------------------------------------------------

	private AutoscalingResources(Builder builder) {

		this.storage = ApiTypeHelper.requireNonNull(builder.storage, this, "storage");
		this.memory = ApiTypeHelper.requireNonNull(builder.memory, this, "memory");

	}

	public static AutoscalingResources of(Function<Builder, ObjectBuilder<AutoscalingResources>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code storage}
	 */
	public final int storage() {
		return this.storage;
	}

	/**
	 * Required - API name: {@code memory}
	 */
	public final int memory() {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AutoscalingResources}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<AutoscalingResources> {
		private Integer storage;

		private Integer memory;

		/**
		 * Required - API name: {@code storage}
		 */
		public final Builder storage(int value) {
			this.storage = value;
			return this;
		}

		/**
		 * Required - API name: {@code memory}
		 */
		public final Builder memory(int value) {
			this.memory = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AutoscalingResources}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AutoscalingResources build() {
			_checkSingleUse();

			return new AutoscalingResources(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AutoscalingResources}
	 */
	public static final JsonpDeserializer<AutoscalingResources> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AutoscalingResources::setupAutoscalingResourcesDeserializer);

	protected static void setupAutoscalingResourcesDeserializer(ObjectDeserializer<AutoscalingResources.Builder> op) {

		op.add(Builder::storage, JsonpDeserializer.integerDeserializer(), "storage");
		op.add(Builder::memory, JsonpDeserializer.integerDeserializer(), "memory");

	}

}
