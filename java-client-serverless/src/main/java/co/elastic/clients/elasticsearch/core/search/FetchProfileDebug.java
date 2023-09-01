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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.FetchProfileDebug

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.FetchProfileDebug">API
 *      specification</a>
 */
@JsonpDeserializable
public class FetchProfileDebug implements JsonpSerializable {
	private final List<String> storedFields;

	@Nullable
	private final Integer fastPath;

	// ---------------------------------------------------------------------------------------------

	private FetchProfileDebug(Builder builder) {

		this.storedFields = ApiTypeHelper.unmodifiable(builder.storedFields);
		this.fastPath = builder.fastPath;

	}

	public static FetchProfileDebug of(Function<Builder, ObjectBuilder<FetchProfileDebug>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code stored_fields}
	 */
	public final List<String> storedFields() {
		return this.storedFields;
	}

	/**
	 * API name: {@code fast_path}
	 */
	@Nullable
	public final Integer fastPath() {
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

		if (ApiTypeHelper.isDefined(this.storedFields)) {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FetchProfileDebug}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<FetchProfileDebug> {
		@Nullable
		private List<String> storedFields;

		@Nullable
		private Integer fastPath;

		/**
		 * API name: {@code stored_fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>storedFields</code>.
		 */
		public final Builder storedFields(List<String> list) {
			this.storedFields = _listAddAll(this.storedFields, list);
			return this;
		}

		/**
		 * API name: {@code stored_fields}
		 * <p>
		 * Adds one or more values to <code>storedFields</code>.
		 */
		public final Builder storedFields(String value, String... values) {
			this.storedFields = _listAdd(this.storedFields, value, values);
			return this;
		}

		/**
		 * API name: {@code fast_path}
		 */
		public final Builder fastPath(@Nullable Integer value) {
			this.fastPath = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FetchProfileDebug}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FetchProfileDebug build() {
			_checkSingleUse();

			return new FetchProfileDebug(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FetchProfileDebug}
	 */
	public static final JsonpDeserializer<FetchProfileDebug> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FetchProfileDebug::setupFetchProfileDebugDeserializer);

	protected static void setupFetchProfileDebugDeserializer(ObjectDeserializer<FetchProfileDebug.Builder> op) {

		op.add(Builder::storedFields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stored_fields");
		op.add(Builder::fastPath, JsonpDeserializer.integerDeserializer(), "fast_path");

	}

}
