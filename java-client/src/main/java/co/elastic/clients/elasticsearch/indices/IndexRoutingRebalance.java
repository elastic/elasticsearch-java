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

// typedef: indices._types.IndexRoutingRebalance

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.IndexRoutingRebalance">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexRoutingRebalance implements JsonpSerializable {
	private final IndexRoutingRebalanceOptions enable;

	// ---------------------------------------------------------------------------------------------

	private IndexRoutingRebalance(Builder builder) {

		this.enable = ApiTypeHelper.requireNonNull(builder.enable, this, "enable");

	}

	public static IndexRoutingRebalance of(Function<Builder, ObjectBuilder<IndexRoutingRebalance>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code enable}
	 */
	public final IndexRoutingRebalanceOptions enable() {
		return this.enable;
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

		generator.writeKey("enable");
		this.enable.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexRoutingRebalance}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<IndexRoutingRebalance> {
		private IndexRoutingRebalanceOptions enable;

		/**
		 * Required - API name: {@code enable}
		 */
		public final Builder enable(IndexRoutingRebalanceOptions value) {
			this.enable = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndexRoutingRebalance}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexRoutingRebalance build() {
			_checkSingleUse();

			return new IndexRoutingRebalance(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexRoutingRebalance}
	 */
	public static final JsonpDeserializer<IndexRoutingRebalance> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndexRoutingRebalance::setupIndexRoutingRebalanceDeserializer);

	protected static void setupIndexRoutingRebalanceDeserializer(ObjectDeserializer<IndexRoutingRebalance.Builder> op) {

		op.add(Builder::enable, IndexRoutingRebalanceOptions._DESERIALIZER, "enable");

	}

}
