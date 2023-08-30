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

package co.elastic.clients.elasticsearch.synonyms;

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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: synonyms._types.SynonymRuleRead

/**
 *
 * @see <a href="../doc-files/api-spec.html#synonyms._types.SynonymRuleRead">API
 *      specification</a>
 */
@JsonpDeserializable
public class SynonymRuleRead implements JsonpSerializable {
	private final String id;

	private final String synonyms;

	// ---------------------------------------------------------------------------------------------

	protected SynonymRuleRead(AbstractBuilder<?> builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.synonyms = ApiTypeHelper.requireNonNull(builder.synonyms, this, "synonyms");

	}

	public static SynonymRuleRead synonymRuleReadOf(Function<Builder, ObjectBuilder<SynonymRuleRead>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Synonym Rule identifier
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - Synonyms, in Solr format, that conform the synonym rule. See
	 * <a href=
	 * "https://www.elastic.co/guide/en/elasticsearch/reference/current/analysis-synonym-graph-tokenfilter.html#_solr_synonyms_2">https://www.elastic.co/guide/en/elasticsearch/reference/current/analysis-synonym-graph-tokenfilter.html#_solr_synonyms_2</a>
	 * <p>
	 * API name: {@code synonyms}
	 */
	public final String synonyms() {
		return this.synonyms;
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

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("synonyms");
		generator.write(this.synonyms);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SynonymRuleRead}.
	 */

	public static class Builder extends SynonymRuleRead.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SynonymRuleRead> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SynonymRuleRead}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SynonymRuleRead build() {
			_checkSingleUse();

			return new SynonymRuleRead(this);
		}
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		private String id;

		private String synonyms;

		/**
		 * Required - Synonym Rule identifier
		 * <p>
		 * API name: {@code id}
		 */
		public final BuilderT id(String value) {
			this.id = value;
			return self();
		}

		/**
		 * Required - Synonyms, in Solr format, that conform the synonym rule. See
		 * <a href=
		 * "https://www.elastic.co/guide/en/elasticsearch/reference/current/analysis-synonym-graph-tokenfilter.html#_solr_synonyms_2">https://www.elastic.co/guide/en/elasticsearch/reference/current/analysis-synonym-graph-tokenfilter.html#_solr_synonyms_2</a>
		 * <p>
		 * API name: {@code synonyms}
		 */
		public final BuilderT synonyms(String value) {
			this.synonyms = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SynonymRuleRead}
	 */
	public static final JsonpDeserializer<SynonymRuleRead> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SynonymRuleRead::setupSynonymRuleReadDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupSynonymRuleReadDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(AbstractBuilder::synonyms, JsonpDeserializer.stringDeserializer(), "synonyms");

	}

}
