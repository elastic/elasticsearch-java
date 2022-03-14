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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.TranslogRetention

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.TranslogRetention">API
 *      specification</a>
 */
@JsonpDeserializable
public class TranslogRetention implements JsonpSerializable {
	private final String size;

	// ---------------------------------------------------------------------------------------------

	private TranslogRetention(Builder builder) {

		this.size = ApiTypeHelper.requireNonNull(builder.size, this, "size");

	}

	public static TranslogRetention of(Function<Builder, ObjectBuilder<TranslogRetention>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code size}
	 */
	public final String size() {
		return this.size;
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

		generator.writeKey("size");
		generator.write(this.size);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TranslogRetention}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<TranslogRetention> {
		private String size;

		/**
		 * Required - API name: {@code size}
		 */
		public final Builder size(String value) {
			this.size = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TranslogRetention}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TranslogRetention build() {
			_checkSingleUse();

			return new TranslogRetention(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TranslogRetention}
	 */
	public static final JsonpDeserializer<TranslogRetention> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TranslogRetention::setupTranslogRetentionDeserializer);

	protected static void setupTranslogRetentionDeserializer(ObjectDeserializer<TranslogRetention.Builder> op) {

		op.add(Builder::size, JsonpDeserializer.stringDeserializer(), "size");

	}

}
