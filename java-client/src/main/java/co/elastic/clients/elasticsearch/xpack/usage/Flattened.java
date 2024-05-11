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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: xpack.usage.Flattened

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.Flattened">API
 *      specification</a>
 */
@JsonpDeserializable
public class Flattened extends Base {
	private final int fieldCount;

	// ---------------------------------------------------------------------------------------------

	private Flattened(Builder builder) {
		super(builder);

		this.fieldCount = ApiTypeHelper.requireNonNull(builder.fieldCount, this, "fieldCount");

	}

	public static Flattened of(Function<Builder, ObjectBuilder<Flattened>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code field_count}
	 */
	public final int fieldCount() {
		return this.fieldCount;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("field_count");
		generator.write(this.fieldCount);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Flattened}.
	 */

	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<Flattened> {
		private Integer fieldCount;

		/**
		 * Required - API name: {@code field_count}
		 */
		public final Builder fieldCount(int value) {
			this.fieldCount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Flattened}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Flattened build() {
			_checkSingleUse();

			return new Flattened(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Flattened}
	 */
	public static final JsonpDeserializer<Flattened> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Flattened::setupFlattenedDeserializer);

	protected static void setupFlattenedDeserializer(ObjectDeserializer<Flattened.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::fieldCount, JsonpDeserializer.integerDeserializer(), "field_count");

	}

}
