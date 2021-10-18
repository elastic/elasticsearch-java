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

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.FetchProfileDebug
@JsonpDeserializable
public final class FetchProfileDebug implements JsonpSerializable {
	@Nullable
	private final List<String> storedFields;

	@Nullable
	private final Integer fastPath;

	// ---------------------------------------------------------------------------------------------

	public FetchProfileDebug(Builder builder) {

		this.storedFields = ModelTypeHelper.unmodifiable(builder.storedFields);
		this.fastPath = builder.fastPath;

	}

	public FetchProfileDebug(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code stored_fields}
	 */
	@Nullable
	public List<String> storedFields() {
		return this.storedFields;
	}

	/**
	 * API name: {@code fast_path}
	 */
	@Nullable
	public Integer fastPath() {
		return this.fastPath;
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

		if (this.storedFields != null) {

			generator.writeKey("stored_fields");
			generator.writeStartArray();
			for (String item0 : this.storedFields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.fastPath != null) {

			generator.writeKey("fast_path");
			generator.write(this.fastPath);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FetchProfileDebug}.
	 */
	public static class Builder implements ObjectBuilder<FetchProfileDebug> {
		@Nullable
		private List<String> storedFields;

		@Nullable
		private Integer fastPath;

		/**
		 * API name: {@code stored_fields}
		 */
		public Builder storedFields(@Nullable List<String> value) {
			this.storedFields = value;
			return this;
		}

		/**
		 * API name: {@code stored_fields}
		 */
		public Builder storedFields(String... value) {
			this.storedFields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #storedFields(List)}, creating the list if needed.
		 */
		public Builder addStoredFields(String value) {
			if (this.storedFields == null) {
				this.storedFields = new ArrayList<>();
			}
			this.storedFields.add(value);
			return this;
		}

		/**
		 * API name: {@code fast_path}
		 */
		public Builder fastPath(@Nullable Integer value) {
			this.fastPath = value;
			return this;
		}

		/**
		 * Builds a {@link FetchProfileDebug}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FetchProfileDebug build() {

			return new FetchProfileDebug(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FetchProfileDebug}
	 */
	public static final JsonpDeserializer<FetchProfileDebug> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FetchProfileDebug::setupFetchProfileDebugDeserializer, Builder::build);

	protected static void setupFetchProfileDebugDeserializer(DelegatingDeserializer<FetchProfileDebug.Builder> op) {

		op.add(Builder::storedFields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stored_fields");
		op.add(Builder::fastPath, JsonpDeserializer.integerDeserializer(), "fast_path");

	}

}
