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

package co.elastic.clients.elasticsearch.core.mget;

import co.elastic.clients.elasticsearch._types.ErrorCause;
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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.mget.MultiGetError

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_global.mget.MultiGetError">API
 *      specification</a>
 */
@JsonpDeserializable
public class MultiGetError implements JsonpSerializable {
	private final ErrorCause error;

	private final String id;

	private final String index;

	// ---------------------------------------------------------------------------------------------

	private MultiGetError(Builder builder) {

		this.error = ApiTypeHelper.requireNonNull(builder.error, this, "error");
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");

	}

	public static MultiGetError of(Function<Builder, ObjectBuilder<MultiGetError>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code error}
	 */
	public final ErrorCause error() {
		return this.error;
	}

	/**
	 * Required - API name: {@code _id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code _index}
	 */
	public final String index() {
		return this.index;
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

		generator.writeKey("error");
		this.error.serialize(generator, mapper);

		generator.writeKey("_id");
		generator.write(this.id);

		generator.writeKey("_index");
		generator.write(this.index);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MultiGetError}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<MultiGetError> {
		private ErrorCause error;

		private String id;

		private String index;

		/**
		 * Required - API name: {@code error}
		 */
		public final Builder error(ErrorCause value) {
			this.error = value;
			return this;
		}

		/**
		 * Required - API name: {@code error}
		 */
		public final Builder error(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.error(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * Required - API name: {@code _id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code _index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MultiGetError}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MultiGetError build() {
			_checkSingleUse();

			return new MultiGetError(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MultiGetError}
	 */
	public static final JsonpDeserializer<MultiGetError> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MultiGetError::setupMultiGetErrorDeserializer);

	protected static void setupMultiGetErrorDeserializer(ObjectDeserializer<MultiGetError.Builder> op) {

		op.add(Builder::error, ErrorCause._DESERIALIZER, "error");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "_index");

	}

}
