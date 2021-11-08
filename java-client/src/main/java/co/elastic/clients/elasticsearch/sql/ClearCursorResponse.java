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

package co.elastic.clients.elasticsearch.sql;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;

// typedef: sql.clear_cursor.Response
@JsonpDeserializable
public class ClearCursorResponse implements JsonpSerializable {
	private final boolean succeeded;

	// ---------------------------------------------------------------------------------------------

	private ClearCursorResponse(Builder builder) {

		this.succeeded = ModelTypeHelper.requireNonNull(builder.succeeded, this, "succeeded");

	}

	public static ClearCursorResponse of(Function<Builder, ObjectBuilder<ClearCursorResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code succeeded}
	 */
	public final boolean succeeded() {
		return this.succeeded;
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

		generator.writeKey("succeeded");
		generator.write(this.succeeded);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClearCursorResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ClearCursorResponse> {
		private Boolean succeeded;

		/**
		 * Required - API name: {@code succeeded}
		 */
		public final Builder succeeded(boolean value) {
			this.succeeded = value;
			return this;
		}

		/**
		 * Builds a {@link ClearCursorResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClearCursorResponse build() {
			_checkSingleUse();

			return new ClearCursorResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClearCursorResponse}
	 */
	public static final JsonpDeserializer<ClearCursorResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClearCursorResponse::setupClearCursorResponseDeserializer, Builder::build);

	protected static void setupClearCursorResponseDeserializer(DelegatingDeserializer<ClearCursorResponse.Builder> op) {

		op.add(Builder::succeeded, JsonpDeserializer.booleanDeserializer(), "succeeded");

	}

}
