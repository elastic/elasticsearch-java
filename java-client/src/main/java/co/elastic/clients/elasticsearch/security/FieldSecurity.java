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

package co.elastic.clients.elasticsearch.security;

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
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security._types.FieldSecurity
@JsonpDeserializable
public class FieldSecurity implements JsonpSerializable {
	private final List<String> except;

	private final List<String> grant;

	// ---------------------------------------------------------------------------------------------

	private FieldSecurity(Builder builder) {

		this.except = ModelTypeHelper.unmodifiable(builder.except);
		this.grant = ModelTypeHelper.unmodifiableRequired(builder.grant, this, "grant");

	}

	public static FieldSecurity of(Function<Builder, ObjectBuilder<FieldSecurity>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code except}
	 */
	public final List<String> except() {
		return this.except;
	}

	/**
	 * Required - API name: {@code grant}
	 */
	public final List<String> grant() {
		return this.grant;
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

		if (ModelTypeHelper.isDefined(this.except)) {
			generator.writeKey("except");
			generator.writeStartArray();
			for (String item0 : this.except) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.grant)) {
			generator.writeKey("grant");
			generator.writeStartArray();
			for (String item0 : this.grant) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldSecurity}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<FieldSecurity> {
		@Nullable
		private List<String> except;

		private List<String> grant;

		/**
		 * API name: {@code except}
		 */
		public final Builder except(@Nullable List<String> value) {
			this.except = value;
			return this;
		}

		/**
		 * API name: {@code except}
		 */
		public final Builder except(String... value) {
			this.except = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code grant}
		 */
		public final Builder grant(List<String> value) {
			this.grant = value;
			return this;
		}

		/**
		 * Required - API name: {@code grant}
		 */
		public final Builder grant(String... value) {
			this.grant = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link FieldSecurity}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldSecurity build() {
			_checkSingleUse();

			return new FieldSecurity(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FieldSecurity}
	 */
	public static final JsonpDeserializer<FieldSecurity> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FieldSecurity::setupFieldSecurityDeserializer, Builder::build);

	protected static void setupFieldSecurityDeserializer(DelegatingDeserializer<FieldSecurity.Builder> op) {

		op.add(Builder::except, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "except");
		op.add(Builder::grant, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "grant");

	}

}
