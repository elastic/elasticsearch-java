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

package co.elastic.clients.elasticsearch._types;

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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.BulkIndexByScrollFailure

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.BulkIndexByScrollFailure">API
 *      specification</a>
 */
@JsonpDeserializable
public class BulkIndexByScrollFailure implements JsonpSerializable {
	private final ErrorCause cause;

	private final String id;

	private final String index;

	private final int status;

	private final String type;

	// ---------------------------------------------------------------------------------------------

	private BulkIndexByScrollFailure(Builder builder) {

		this.cause = ApiTypeHelper.requireNonNull(builder.cause, this, "cause");
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");

	}

	public static BulkIndexByScrollFailure of(Function<Builder, ObjectBuilder<BulkIndexByScrollFailure>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code cause}
	 */
	public final ErrorCause cause() {
		return this.cause;
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Required - API name: {@code status}
	 */
	public final int status() {
		return this.status;
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final String type() {
		return this.type;
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

		generator.writeKey("cause");
		this.cause.serialize(generator, mapper);

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("index");
		generator.write(this.index);

		generator.writeKey("status");
		generator.write(this.status);

		generator.writeKey("type");
		generator.write(this.type);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BulkIndexByScrollFailure}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<BulkIndexByScrollFailure> {
		private ErrorCause cause;

		private String id;

		private String index;

		private Integer status;

		private String type;

		/**
		 * Required - API name: {@code cause}
		 */
		public final Builder cause(ErrorCause value) {
			this.cause = value;
			return this;
		}

		/**
		 * Required - API name: {@code cause}
		 */
		public final Builder cause(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.cause(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(int value) {
			this.status = value;
			return this;
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link BulkIndexByScrollFailure}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BulkIndexByScrollFailure build() {
			_checkSingleUse();

			return new BulkIndexByScrollFailure(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BulkIndexByScrollFailure}
	 */
	public static final JsonpDeserializer<BulkIndexByScrollFailure> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, BulkIndexByScrollFailure::setupBulkIndexByScrollFailureDeserializer);

	protected static void setupBulkIndexByScrollFailureDeserializer(
			ObjectDeserializer<BulkIndexByScrollFailure.Builder> op) {

		op.add(Builder::cause, ErrorCause._DESERIALIZER, "cause");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::status, JsonpDeserializer.integerDeserializer(), "status");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");

	}

}
