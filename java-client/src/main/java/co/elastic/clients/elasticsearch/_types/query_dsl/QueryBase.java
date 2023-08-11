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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Float;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.QueryBase

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_types.query_dsl.QueryBase">API
 *      specification</a>
 */

public abstract class QueryBase implements JsonpSerializable {
	@Nullable
	private final Float boost;

	@Nullable
	private final String queryName;

	// ---------------------------------------------------------------------------------------------

	protected QueryBase(AbstractBuilder<?> builder) {

		this.boost = builder.boost;
		this.queryName = builder.queryName;

	}

	/**
	 * Floating point number used to decrease or increase the relevance scores of
	 * the query. Boost values are relative to the default value of 1.0. A boost
	 * value between 0 and 1.0 decreases the relevance score. A value greater than
	 * 1.0 increases the relevance score.
	 * <p>
	 * API name: {@code boost}
	 */
	@Nullable
	public final Float boost() {
		return this.boost;
	}

	/**
	 * API name: {@code _name}
	 */
	@Nullable
	public final String queryName() {
		return this.queryName;
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

		if (this.boost != null) {
			generator.writeKey("boost");
			generator.write(this.boost);

		}
		if (this.queryName != null) {
			generator.writeKey("_name");
			generator.write(this.queryName);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		@Nullable
		private Float boost;

		@Nullable
		private String queryName;

		/**
		 * Floating point number used to decrease or increase the relevance scores of
		 * the query. Boost values are relative to the default value of 1.0. A boost
		 * value between 0 and 1.0 decreases the relevance score. A value greater than
		 * 1.0 increases the relevance score.
		 * <p>
		 * API name: {@code boost}
		 */
		public final BuilderT boost(@Nullable Float value) {
			this.boost = value;
			return self();
		}

		/**
		 * API name: {@code _name}
		 */
		public final BuilderT queryName(@Nullable String value) {
			this.queryName = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupQueryBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::boost, JsonpDeserializer.floatDeserializer(), "boost");
		op.add(AbstractBuilder::queryName, JsonpDeserializer.stringDeserializer(), "_name");

	}

}
