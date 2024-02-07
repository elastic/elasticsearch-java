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
import java.lang.Long;
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

// typedef: xpack.usage.Archive

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.Archive">API
 *      specification</a>
 */
@JsonpDeserializable
public class Archive extends Base {
	private final long indicesCount;

	// ---------------------------------------------------------------------------------------------

	private Archive(Builder builder) {
		super(builder);

		this.indicesCount = ApiTypeHelper.requireNonNull(builder.indicesCount, this, "indicesCount");

	}

	public static Archive of(Function<Builder, ObjectBuilder<Archive>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code indices_count}
	 */
	public final long indicesCount() {
		return this.indicesCount;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("indices_count");
		generator.write(this.indicesCount);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Archive}.
	 */

	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<Archive> {
		private Long indicesCount;

		/**
		 * Required - API name: {@code indices_count}
		 */
		public final Builder indicesCount(long value) {
			this.indicesCount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Archive}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Archive build() {
			_checkSingleUse();

			return new Archive(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Archive}
	 */
	public static final JsonpDeserializer<Archive> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Archive::setupArchiveDeserializer);

	protected static void setupArchiveDeserializer(ObjectDeserializer<Archive.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::indicesCount, JsonpDeserializer.longDeserializer(), "indices_count");

	}

}
