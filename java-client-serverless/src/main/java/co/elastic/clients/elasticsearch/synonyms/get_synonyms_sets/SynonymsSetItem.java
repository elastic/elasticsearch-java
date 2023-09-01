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

package co.elastic.clients.elasticsearch.synonyms.get_synonyms_sets;

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

// typedef: synonyms.get_synonyms_sets.SynonymsSetItem

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#synonyms.get_synonyms_sets.SynonymsSetItem">API
 *      specification</a>
 */
@JsonpDeserializable
public class SynonymsSetItem implements JsonpSerializable {
	private final String synonymsSet;

	private final int count;

	// ---------------------------------------------------------------------------------------------

	private SynonymsSetItem(Builder builder) {

		this.synonymsSet = ApiTypeHelper.requireNonNull(builder.synonymsSet, this, "synonymsSet");
		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");

	}

	public static SynonymsSetItem of(Function<Builder, ObjectBuilder<SynonymsSetItem>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Synonyms set identifier
	 * <p>
	 * API name: {@code synonyms_set}
	 */
	public final String synonymsSet() {
		return this.synonymsSet;
	}

	/**
	 * Required - Number of synonym rules that the synonym set contains
	 * <p>
	 * API name: {@code count}
	 */
	public final int count() {
		return this.count;
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

		generator.writeKey("synonyms_set");
		generator.write(this.synonymsSet);

		generator.writeKey("count");
		generator.write(this.count);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SynonymsSetItem}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SynonymsSetItem> {
		private String synonymsSet;

		private Integer count;

		/**
		 * Required - Synonyms set identifier
		 * <p>
		 * API name: {@code synonyms_set}
		 */
		public final Builder synonymsSet(String value) {
			this.synonymsSet = value;
			return this;
		}

		/**
		 * Required - Number of synonym rules that the synonym set contains
		 * <p>
		 * API name: {@code count}
		 */
		public final Builder count(int value) {
			this.count = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SynonymsSetItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SynonymsSetItem build() {
			_checkSingleUse();

			return new SynonymsSetItem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SynonymsSetItem}
	 */
	public static final JsonpDeserializer<SynonymsSetItem> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SynonymsSetItem::setupSynonymsSetItemDeserializer);

	protected static void setupSynonymsSetItemDeserializer(ObjectDeserializer<SynonymsSetItem.Builder> op) {

		op.add(Builder::synonymsSet, JsonpDeserializer.stringDeserializer(), "synonyms_set");
		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");

	}

}
