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

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
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

// typedef: snapshot._types.SourceOnlyRepositorySettings

/**
 * The delegated repository type. Source repositories can use
 * <code>settings</code> properties for its delegated repository type.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#snapshot._types.SourceOnlyRepositorySettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class SourceOnlyRepositorySettings
		implements
			TaggedUnion<SourceOnlyRepositorySettings.Kind, SourceOnlyRepositorySettingsVariant>,
			JsonpSerializable {

	/**
	 * {@link SourceOnlyRepositorySettings} variant kinds.
	 * 
	 * @see <a href=
	 *      "../doc-files/api-spec.html#snapshot._types.SourceOnlyRepositorySettings">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Azure("azure"),

		Gcs("gcs"),

		Url("url"),

		S3("s3"),

		Fs("fs"),

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

	}

	private final Kind _kind;
	private final SourceOnlyRepositorySettingsVariant _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final SourceOnlyRepositorySettingsVariant _get() {
		return _value;
	}

	public SourceOnlyRepositorySettings(SourceOnlyRepositorySettingsVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._sourceOnlyRepositorySettingsKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private SourceOnlyRepositorySettings(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static SourceOnlyRepositorySettings of(Function<Builder, ObjectBuilder<SourceOnlyRepositorySettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code azure}?
	 */
	public boolean isAzure() {
		return _kind == Kind.Azure;
	}

	/**
	 * Get the {@code azure} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code azure} kind.
	 */
	public SourceOnlyRepositorySettingsForAzure azure() {
		return TaggedUnionUtils.get(this, Kind.Azure);
	}

	/**
	 * Is this variant instance of kind {@code gcs}?
	 */
	public boolean isGcs() {
		return _kind == Kind.Gcs;
	}

	/**
	 * Get the {@code gcs} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code gcs} kind.
	 */
	public SourceOnlyRepositorySettingsForGcs gcs() {
		return TaggedUnionUtils.get(this, Kind.Gcs);
	}

	/**
	 * Is this variant instance of kind {@code url}?
	 */
	public boolean isUrl() {
		return _kind == Kind.Url;
	}

	/**
	 * Get the {@code url} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code url} kind.
	 */
	public SourceOnlyRepositorySettingsForReadOnlyUrl url() {
		return TaggedUnionUtils.get(this, Kind.Url);
	}

	/**
	 * Is this variant instance of kind {@code s3}?
	 */
	public boolean isS3() {
		return _kind == Kind.S3;
	}

	/**
	 * Get the {@code s3} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code s3} kind.
	 */
	public SourceOnlyRepositorySettingsForS3 s3() {
		return TaggedUnionUtils.get(this, Kind.S3);
	}

	/**
	 * Is this variant instance of kind {@code fs}?
	 */
	public boolean isFs() {
		return _kind == Kind.Fs;
	}

	/**
	 * Get the {@code fs} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code fs} kind.
	 */
	public SourceOnlyRepositorySettingsForSharedFileSystem fs() {
		return TaggedUnionUtils.get(this, Kind.Fs);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SourceOnlyRepositorySettings> {
		private Kind _kind;
		private SourceOnlyRepositorySettingsVariant _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<SourceOnlyRepositorySettings> azure(SourceOnlyRepositorySettingsForAzure v) {
			this._kind = Kind.Azure;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SourceOnlyRepositorySettings> azure(
				Function<SourceOnlyRepositorySettingsForAzure.Builder, ObjectBuilder<SourceOnlyRepositorySettingsForAzure>> fn) {
			return this.azure(fn.apply(new SourceOnlyRepositorySettingsForAzure.Builder()).build());
		}

		public ObjectBuilder<SourceOnlyRepositorySettings> gcs(SourceOnlyRepositorySettingsForGcs v) {
			this._kind = Kind.Gcs;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SourceOnlyRepositorySettings> gcs(
				Function<SourceOnlyRepositorySettingsForGcs.Builder, ObjectBuilder<SourceOnlyRepositorySettingsForGcs>> fn) {
			return this.gcs(fn.apply(new SourceOnlyRepositorySettingsForGcs.Builder()).build());
		}

		public ObjectBuilder<SourceOnlyRepositorySettings> url(SourceOnlyRepositorySettingsForReadOnlyUrl v) {
			this._kind = Kind.Url;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SourceOnlyRepositorySettings> url(
				Function<SourceOnlyRepositorySettingsForReadOnlyUrl.Builder, ObjectBuilder<SourceOnlyRepositorySettingsForReadOnlyUrl>> fn) {
			return this.url(fn.apply(new SourceOnlyRepositorySettingsForReadOnlyUrl.Builder()).build());
		}

		public ObjectBuilder<SourceOnlyRepositorySettings> s3(SourceOnlyRepositorySettingsForS3 v) {
			this._kind = Kind.S3;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SourceOnlyRepositorySettings> s3(
				Function<SourceOnlyRepositorySettingsForS3.Builder, ObjectBuilder<SourceOnlyRepositorySettingsForS3>> fn) {
			return this.s3(fn.apply(new SourceOnlyRepositorySettingsForS3.Builder()).build());
		}

		public ObjectBuilder<SourceOnlyRepositorySettings> fs(SourceOnlyRepositorySettingsForSharedFileSystem v) {
			this._kind = Kind.Fs;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SourceOnlyRepositorySettings> fs(
				Function<SourceOnlyRepositorySettingsForSharedFileSystem.Builder, ObjectBuilder<SourceOnlyRepositorySettingsForSharedFileSystem>> fn) {
			return this.fs(fn.apply(new SourceOnlyRepositorySettingsForSharedFileSystem.Builder()).build());
		}

		public SourceOnlyRepositorySettings build() {
			_checkSingleUse();
			return new SourceOnlyRepositorySettings(this);
		}

	}

	protected static void setupSourceOnlyRepositorySettingsDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::azure, SourceOnlyRepositorySettingsForAzure._DESERIALIZER, "azure");
		op.add(Builder::gcs, SourceOnlyRepositorySettingsForGcs._DESERIALIZER, "gcs");
		op.add(Builder::url, SourceOnlyRepositorySettingsForReadOnlyUrl._DESERIALIZER, "url");
		op.add(Builder::s3, SourceOnlyRepositorySettingsForS3._DESERIALIZER, "s3");
		op.add(Builder::fs, SourceOnlyRepositorySettingsForSharedFileSystem._DESERIALIZER, "fs");

		op.setTypeProperty("delegate_type", null);

	}

	public static final JsonpDeserializer<SourceOnlyRepositorySettings> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, SourceOnlyRepositorySettings::setupSourceOnlyRepositorySettingsDeserializer, Builder::build);
}
