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

package co.elastic.clients.elasticsearch.core.rank_eval;

import co.elastic.clients.elasticsearch._types.Script;
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

// typedef: _global.rank_eval.RankEvalTemplate

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.rank_eval.RankEvalTemplate">API
 *      specification</a>
 */
@JsonpDeserializable
public class RankEvalTemplate implements JsonpSerializable {
	private final String id;

	private final Script template;

	// ---------------------------------------------------------------------------------------------

	private RankEvalTemplate(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.template = ApiTypeHelper.requireNonNull(builder.template, this, "template");

	}

	public static RankEvalTemplate of(Function<Builder, ObjectBuilder<RankEvalTemplate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The ID of the template. A rated request refers to it by this ID in
	 * its <code>template_id</code>.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - The search template, either an inline <code>source</code> or the
	 * <code>id</code> of a stored search template. It must be a
	 * <code>mustache</code> template (the default <code>lang</code>), and it must
	 * render to a search request body. Any <code>params</code> set here are
	 * ignored: each rated request provides its own <code>params</code>, which are
	 * used to render the template.
	 * <p>
	 * API name: {@code template}
	 */
	public final Script template() {
		return this.template;
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

		generator.writeKey("template");
		this.template.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RankEvalTemplate}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RankEvalTemplate> {
		private String id;

		private Script template;

		public Builder() {
		}
		private Builder(RankEvalTemplate instance) {
			this.id = instance.id;
			this.template = instance.template;

		}
		/**
		 * Required - The ID of the template. A rated request refers to it by this ID in
		 * its <code>template_id</code>.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - The search template, either an inline <code>source</code> or the
		 * <code>id</code> of a stored search template. It must be a
		 * <code>mustache</code> template (the default <code>lang</code>), and it must
		 * render to a search request body. Any <code>params</code> set here are
		 * ignored: each rated request provides its own <code>params</code>, which are
		 * used to render the template.
		 * <p>
		 * API name: {@code template}
		 */
		public final Builder template(Script value) {
			this.template = value;
			return this;
		}

		/**
		 * Required - The search template, either an inline <code>source</code> or the
		 * <code>id</code> of a stored search template. It must be a
		 * <code>mustache</code> template (the default <code>lang</code>), and it must
		 * render to a search request body. Any <code>params</code> set here are
		 * ignored: each rated request provides its own <code>params</code>, which are
		 * used to render the template.
		 * <p>
		 * API name: {@code template}
		 */
		public final Builder template(Function<Script.Builder, ObjectBuilder<Script>> fn) {
			return this.template(fn.apply(new Script.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RankEvalTemplate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RankEvalTemplate build() {
			_checkSingleUse();

			return new RankEvalTemplate(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RankEvalTemplate}
	 */
	public static final JsonpDeserializer<RankEvalTemplate> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RankEvalTemplate::setupRankEvalTemplateDeserializer);

	protected static void setupRankEvalTemplateDeserializer(ObjectDeserializer<RankEvalTemplate.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::template, Script._DESERIALIZER, "template");

	}

}
