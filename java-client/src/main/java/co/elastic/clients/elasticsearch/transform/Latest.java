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

package co.elastic.clients.elasticsearch.transform;

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

// typedef: transform._types.Latest
@JsonpDeserializable
public class Latest implements JsonpSerializable {
	private final String sort;

	private final List<String> uniqueKey;

	// ---------------------------------------------------------------------------------------------

	private Latest(Builder builder) {

		this.sort = ModelTypeHelper.requireNonNull(builder.sort, this, "sort");
		this.uniqueKey = ModelTypeHelper.unmodifiableRequired(builder.uniqueKey, this, "uniqueKey");

	}

	public static Latest of(Function<Builder, ObjectBuilder<Latest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Specifies the date field that is used to identify the latest
	 * documents.
	 * <p>
	 * API name: {@code sort}
	 */
	public final String sort() {
		return this.sort;
	}

	/**
	 * Required - Specifies an array of one or more fields that are used to group
	 * the data.
	 * <p>
	 * API name: {@code unique_key}
	 */
	public final List<String> uniqueKey() {
		return this.uniqueKey;
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

		generator.writeKey("sort");
		generator.write(this.sort);

		if (ModelTypeHelper.isDefined(this.uniqueKey)) {
			generator.writeKey("unique_key");
			generator.writeStartArray();
			for (String item0 : this.uniqueKey) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Latest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Latest> {
		private String sort;

		private List<String> uniqueKey;

		/**
		 * Required - Specifies the date field that is used to identify the latest
		 * documents.
		 * <p>
		 * API name: {@code sort}
		 */
		public final Builder sort(String value) {
			this.sort = value;
			return this;
		}

		/**
		 * Required - Specifies an array of one or more fields that are used to group
		 * the data.
		 * <p>
		 * API name: {@code unique_key}
		 */
		public final Builder uniqueKey(List<String> value) {
			this.uniqueKey = value;
			return this;
		}

		/**
		 * Required - Specifies an array of one or more fields that are used to group
		 * the data.
		 * <p>
		 * API name: {@code unique_key}
		 */
		public final Builder uniqueKey(String... value) {
			this.uniqueKey = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link Latest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Latest build() {
			_checkSingleUse();

			return new Latest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Latest}
	 */
	public static final JsonpDeserializer<Latest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Latest::setupLatestDeserializer, Builder::build);

	protected static void setupLatestDeserializer(DelegatingDeserializer<Latest.Builder> op) {

		op.add(Builder::sort, JsonpDeserializer.stringDeserializer(), "sort");
		op.add(Builder::uniqueKey, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"unique_key");

	}

}
