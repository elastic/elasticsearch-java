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

package co.elastic.clients.elasticsearch._core.search;

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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.NestedIdentity
@JsonpDeserializable
public final class NestedIdentity implements JsonpSerializable {
	private final String field;

	private final int offset;

	@Nullable
	private final NestedIdentity nested;

	// ---------------------------------------------------------------------------------------------

	public NestedIdentity(Builder builder) {

		this.field = Objects.requireNonNull(builder.field, "field");
		this.offset = Objects.requireNonNull(builder.offset, "offset");
		this.nested = builder.nested;

	}

	/**
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code offset}
	 */
	public int offset() {
		return this.offset;
	}

	/**
	 * API name: {@code _nested}
	 */
	@Nullable
	public NestedIdentity nested() {
		return this.nested;
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

		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("offset");
		generator.write(this.offset);

		if (this.nested != null) {

			generator.writeKey("_nested");
			this.nested.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NestedIdentity}.
	 */
	public static class Builder implements ObjectBuilder<NestedIdentity> {
		private String field;

		private Integer offset;

		@Nullable
		private NestedIdentity nested;

		/**
		 * API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code offset}
		 */
		public Builder offset(int value) {
			this.offset = value;
			return this;
		}

		/**
		 * API name: {@code _nested}
		 */
		public Builder nested(@Nullable NestedIdentity value) {
			this.nested = value;
			return this;
		}

		/**
		 * API name: {@code _nested}
		 */
		public Builder nested(Function<NestedIdentity.Builder, ObjectBuilder<NestedIdentity>> fn) {
			return this.nested(fn.apply(new NestedIdentity.Builder()).build());
		}

		/**
		 * Builds a {@link NestedIdentity}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NestedIdentity build() {

			return new NestedIdentity(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NestedIdentity}
	 */
	public static final JsonpDeserializer<NestedIdentity> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NestedIdentity::setupNestedIdentityDeserializer, Builder::build);

	protected static void setupNestedIdentityDeserializer(DelegatingDeserializer<NestedIdentity.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::offset, JsonpDeserializer.integerDeserializer(), "offset");
		op.add(Builder::nested, NestedIdentity._DESERIALIZER, "_nested");

	}

}
