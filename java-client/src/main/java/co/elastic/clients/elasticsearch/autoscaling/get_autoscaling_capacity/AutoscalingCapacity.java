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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

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

// typedef: autoscaling.get_autoscaling_capacity.AutoscalingCapacity

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#autoscaling.get_autoscaling_capacity.AutoscalingCapacity">API
 *      specification</a>
 */
@JsonpDeserializable
public class AutoscalingCapacity implements JsonpSerializable {
	private final AutoscalingResources node;

	private final AutoscalingResources total;

	// ---------------------------------------------------------------------------------------------

	private AutoscalingCapacity(Builder builder) {

		this.node = ApiTypeHelper.requireNonNull(builder.node, this, "node");
		this.total = ApiTypeHelper.requireNonNull(builder.total, this, "total");

	}

	public static AutoscalingCapacity of(Function<Builder, ObjectBuilder<AutoscalingCapacity>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code node}
	 */
	public final AutoscalingResources node() {
		return this.node;
	}

	/**
	 * Required - API name: {@code total}
	 */
	public final AutoscalingResources total() {
		return this.total;
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

		generator.writeKey("node");
		this.node.serialize(generator, mapper);

		generator.writeKey("total");
		this.total.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AutoscalingCapacity}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<AutoscalingCapacity> {
		private AutoscalingResources node;

		private AutoscalingResources total;

		/**
		 * Required - API name: {@code node}
		 */
		public final Builder node(AutoscalingResources value) {
			this.node = value;
			return this;
		}

		/**
		 * Required - API name: {@code node}
		 */
		public final Builder node(Function<AutoscalingResources.Builder, ObjectBuilder<AutoscalingResources>> fn) {
			return this.node(fn.apply(new AutoscalingResources.Builder()).build());
		}

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(AutoscalingResources value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(Function<AutoscalingResources.Builder, ObjectBuilder<AutoscalingResources>> fn) {
			return this.total(fn.apply(new AutoscalingResources.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AutoscalingCapacity}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AutoscalingCapacity build() {
			_checkSingleUse();

			return new AutoscalingCapacity(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AutoscalingCapacity}
	 */
	public static final JsonpDeserializer<AutoscalingCapacity> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AutoscalingCapacity::setupAutoscalingCapacityDeserializer);

	protected static void setupAutoscalingCapacityDeserializer(ObjectDeserializer<AutoscalingCapacity.Builder> op) {

		op.add(Builder::node, AutoscalingResources._DESERIALIZER, "node");
		op.add(Builder::total, AutoscalingResources._DESERIALIZER, "total");

	}

}
